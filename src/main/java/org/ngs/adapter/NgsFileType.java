package org.ngs.adapter;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class NgsFileType extends LanguageFileType {
	public static final String FILE_EXTENSION = "cir";
		public static final NgsFileType INSTANCE = new NgsFileType();

	protected NgsFileType() {
		super(NgsLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public String getName() {
		return "Ngspice circuit file";
	}

	@NotNull
	@Override
	public String getDescription() {
		return "Ngspice circuit file";
	}

	@NotNull
	@Override
	public String getDefaultExtension() {
		return FILE_EXTENSION;
	}

	@Nullable
	@Override
	public Icon getIcon() {
		return Icons.NGS_ICON;
	}
}
