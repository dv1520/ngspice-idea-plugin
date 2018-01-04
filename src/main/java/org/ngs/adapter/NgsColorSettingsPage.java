package org.ngs.adapter;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

public class NgsColorSettingsPage implements ColorSettingsPage {
	private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
		new AttributesDescriptor("First line", NgsSyntaxHighlighter.LINE_HEAD),
		new AttributesDescriptor("Comment", NgsSyntaxHighlighter.LINE_COMMENT),
		new AttributesDescriptor("Key", NgsSyntaxHighlighter.KV_KEY),
		new AttributesDescriptor("Value", NgsSyntaxHighlighter.VAL),
		new AttributesDescriptor("Model", NgsSyntaxHighlighter.MODEL),
		new AttributesDescriptor("Node", NgsSyntaxHighlighter.NODE),
		new AttributesDescriptor("Subcircuit", NgsSyntaxHighlighter.SUBCKT),
	};

	@Nullable
	@Override
	public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap() {
		return null;
	}

	@Nullable
	@Override
	public Icon getIcon() {
		return Icons.NGS_ICON;
	}

	@NotNull
	@Override
	public SyntaxHighlighter getHighlighter() {
		return new NgsSyntaxHighlighter();
	}

	@NotNull
	@Override
	public String getDemoText() {
		return "*head\n" +
				"a1 1 2 amp\n" +
				"DCLMP 3 7 DMOD AREA= 3.0 IC = 0.2\n" +
				"ENONLIN 100 101 POLY ( 2 ) 3 0 4 0 0.0 13.6 0.2 0.005\n" +
				"ESMPL n1 n2 NC1 NC2 99\n" +
				"FNONLIN 100 101 POLY ( 2 ) V1 V2 0.0 13.6 0.2 0.005\n" +
				"FSMPL n1 n2 V3 99\n" +
				"J1 7 2 3 JM1 OFF\n" +
				"k123 l1 l2 0.99\n" +
				"l1 1 2 1m\n" +
				"M31 2 17 6 10 MOSN L=5U W=2U\n" +
				"Q23 10 24 13 QMOD IC = 1 , 5\n" +
				"Q24 1 2 3 QMOD\n" +
				"r1 1 2 22k\n" +
				"RMOD 2 0 a2k\n" +
				"s1 1 2 3 4 smodel1 ON\n" +
				"w1 1 2 v2 smodel2 OFF\n" +
				"T1 1 0 2 0 Z0=50 TD=10NS\n" +
				"O23 1 0 2 0 LOSSYMOD\n" +
				"U1 1 2 0 URCMOD L=50U\n" +
				"x1 1 2 3 vdiv\n" +
				"Y1 1 0 2 0 ymod LEN=2\n" +
				"*v1 1 2 PULSE (1 2 3 4 5 6 7)\n" +
				"Z1 7 2 3 ZM1 OFF\n" +
				"\n" +
				".model MOD1 npn (bf=50 vbf=50)\n" +
				"\n" +
				".subckt vdiv 1 2 3\n" +
				"    r1 1 2 2k\n" +
				".ends vdiv";
	}

	@NotNull
	@Override
	public AttributesDescriptor[] getAttributeDescriptors() {
		return DESCRIPTORS;
	}

	@NotNull
	@Override
	public ColorDescriptor[] getColorDescriptors() {
		return ColorDescriptor.EMPTY_ARRAY;
	}

	@NotNull
	@Override
	public String getDisplayName() {
		return "Ngspice";
	}
}
