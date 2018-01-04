package org.ngs.add.run;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;


/**
 * Created by z on 02.09.17.
 */
public class GraphVI {

    private JFreeChart chart;
    private XYPlot plot;
    private List<String> columnNames = new ArrayList<>();

    private List<XYSeries> allSeries = new ArrayList<>();

    private Map<String, Integer> iToIndex = new LinkedHashMap<>();
    private Map<String, Integer> vToIndex = new LinkedHashMap<>();

    // colors:
    // https://stackoverflow.com/questions/21427762/jfreechart-set-line-colors-for-xy-chart-4-series-2-datasets-dual-axes
    // http://colorbrewer2.org/#type=qualitative&scheme=Paired&n=12
    //

    private List<String> defaultColors = Arrays.asList(
            "#a6cee3",
            "#1f78b4",
            "#b2df8a",
            "#33a02c",
            "#fb9a99",
            "#e31a1c",
            "#fdbf6f",
            "#ff7f00",
            "#cab2d6",
            "#6a3d9a",
            "#ffff99",
            "#b15928"
    );

    public GraphVI() {
        createChart();
    }

    public ChartPanel getChartPanel() {
        ChartPanel panel = new ChartPanel(chart);

        return panel;
    }

    public boolean isValidVisibilitySettings(Map<String, Boolean> visibility) {
        if (visibility.size() != (vToIndex.size() + iToIndex.size())) {
            return false;
        }

        for (String s: visibility.keySet()) {
            if (!vToIndex.containsKey(s) && !iToIndex.containsKey(s)) {
                return false;
            }
        }

        return true;
    }


    public void setIVVisibility(Map<String, Boolean> visibility) {
        for (Map.Entry<String, Boolean> e: visibility.entrySet()) {
            String name = e.getKey();
            Boolean isVisible = e.getValue();

            Integer i = vToIndex.get(name);
            if (i == null) {i = iToIndex.get(name);}

            if (i == null) {continue;}

            plot.getRenderer(i).setSeriesVisible(0, isVisible);
        }
    }

    public Map<String, Boolean> getVVisibility() {
        Map<String, Boolean> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry: vToIndex.entrySet()) {
            boolean isVisible = plot.getRenderer(entry.getValue()).isSeriesVisible(0);

            result.put(entry.getKey(), isVisible);
        }

        return result;
    }

    public Map<String, Boolean> getIVisibility() {
        Map<String, Boolean> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry: iToIndex.entrySet()) {
            boolean isVisible = plot.getRenderer(entry.getValue()).isSeriesVisible(0);

            result.put(entry.getKey(), isVisible);
        }

        return result;
    }

    public void initHead(List<String> head) {
        columnNames.addAll(head);

        iToIndex.clear();
        vToIndex.clear();


        for (int i = 0; i < columnNames.size(); i++) {
            String col = columnNames.get(i);
            XYSeries xySeries = new XYSeries(col);
            XYSeriesCollection dataset = new XYSeriesCollection(xySeries);

            boolean isINotV;
            int axis = 0;
            int colorIndex;
            if (col.startsWith("i") || col.startsWith("I")) {
                isINotV = true;
                axis = 1;

                iToIndex.put(col, i);
            } else {
                isINotV = false;
                axis = 0;

                vToIndex.put(col, i);
            }

            colorIndex = i;

            this.allSeries.add(xySeries);
            plot.setDataset(i, dataset);

            // voltage or current axis
            plot.mapDatasetToRangeAxis(i, axis);
            setPlotColor(i, colorIndex, isINotV);
        }
    }

    public void addRow(List<String> row) {
        double time = 0;
        time = Double.parseDouble(row.get(0));
        for (int i = 1; i < row.size(); i++) {
            try {
                int j = i-1; // the first point is the time
                XYSeries series = allSeries.get(j);

                double val = Double.parseDouble(row.get(i));
                series.add(time, val);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    private void createChart() {
        chart = ChartFactory.createXYLineChart(
                "Graph info",
                "Time",
                "ylabel",
                null,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        plot = chart.getXYPlot();
        plot.setDomainPannable(true);

        plot.setBackgroundPaint(new Color(0xffffe0));
        plot.setDomainGridlinesVisible(true);
        plot.setDomainGridlinePaint(Color.lightGray);
        plot.setRangeGridlinesVisible(true);
        plot.setRangeGridlinePaint(Color.lightGray);

        ValueAxis xaxis = plot.getDomainAxis();
        xaxis.setAutoRange(true);

        xaxis.setVerticalTickLabels(true);


        plot.setRangeAxis(0, new NumberAxis("Voltage, V"));
        plot.setRangeAxis(1, new NumberAxis("Current, A"));
        plot.setDomainAxis(new NumberAxis("X Axis"));
    }

    private void setPlotColor(int seriesIndex, int colorIndex, boolean isDashed) {
        Color color = getColor(colorIndex);
        XYLineAndShapeRenderer r1 = new XYLineAndShapeRenderer();
        r1.setSeriesPaint(0, color);
        r1.setSeriesShapesVisible(0,  true);


        if (isDashed) {
            r1.setSeriesStroke(0,     new BasicStroke(
                    2.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND,
                    1.0f, new float[] {6.0f, 6.0f}, 0.0f
            ));
        }

        plot.setRenderer(seriesIndex, r1);
    }

    private Color getColor(int i) {
        int idx = i % defaultColors.size();
        int level = idx / defaultColors.size();

        if (level > 2) {
            return Color.BLUE;
        }

        String s = defaultColors.get(idx);
        Color c = Color.decode(s);

        for (int j = 0; j < level; j++) {
            c = c.darker();
            c = c.darker();
            c = c.darker();
            c = c.darker();
        }

        return c;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
//                new GraphVI().mn();
                new GraphVI().testDisplay();
            }
        });
    }


    private void testDisplay() {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createChart();
        ChartPanel panel = new ChartPanel(chart);

        initHead(Arrays.asList("v(1)", "i(v1)", "v(2)"));


        frame.getContentPane().add(panel);

        addRow(Arrays.asList("0", "0", "1e-3", "2"));
        addRow(Arrays.asList("1", "5", "2e-3", "5"));



        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
