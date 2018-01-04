package org.ngs.add.cfg;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import org.jdom.Element;
import org.jetbrains.annotations.Nullable;

/**
 * Created by z on 22.08.17.
 */
@State(name = "NGspiceConfiguration", storages = @Storage("ngspice.xml"))
public class NgsConfig implements PersistentStateComponent<Element> {

    private String ngsBinaryPath = "";

    private boolean isExpertOptionsEnabled;
    private String downloadUrl;
    private String unpackDir;

    @Nullable
    @Override
    public Element getState() {
        Element path = new Element("path");
        path.addContent(ngsBinaryPath);

        Element rootElement = new Element("state");
        rootElement.addContent(path);
        return rootElement;
    }

    @Override
    public void loadState(Element state) {
        Element path = state.getChild("path");
        ngsBinaryPath = path.getText();
    }

    public static NgsConfig getInstance() {
        return ServiceManager.getService(NgsConfig.class);
    }

    public String getNgsBinaryPath() {
        return ngsBinaryPath;
    }

    public void setNgsBinaryPath(String ngsBinaryPath) {
        this.ngsBinaryPath = ngsBinaryPath;
    }


    public boolean isExpertOptionsEnabled() {
        return isExpertOptionsEnabled;
    }

    public void setExpertOptionsEnabled(boolean expertOptionsEnabled) {
        isExpertOptionsEnabled = expertOptionsEnabled;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public String getUnpackDir() {
        return unpackDir;
    }

    public void setUnpackDir(String unpackDir) {
        this.unpackDir = unpackDir;
    }
}
