package org.jetbrains.plugins.ruby.ruby.actions.groups;

import com.intellij.execution.RunnerAndConfigurationSettings;
import com.intellij.execution.actions.ChooseRunConfigurationPopup;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.plugins.ruby.RBundle;

public class RunAnythingTemporaryRunConfigurationGroup extends RunAnythingRunConfigurationGroup {
  @NotNull
  @Override
  public String getTitle() {
    return RBundle.message("run.anything.group.title.temporary");
  }

  @NotNull
  @Override
  protected String getSettingsKey() {
    return "run.anything.settings.temporary.configurations";
  }

  @Override
  public boolean isRecent() {
    return true;
  }

  @Override
  protected boolean isTemporary(@NotNull ChooseRunConfigurationPopup.ItemWrapper wrapper) {
    Object value = wrapper.getValue();
    return value instanceof RunnerAndConfigurationSettings && ((RunnerAndConfigurationSettings)value).isTemporary();
  }
}