package br.com.andersonmatte;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.fileChooser.FileChooser;
import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

/**
 * 29/09/2021
 * @author Anderson Matte
 *
 * */
public class HelloAction extends AnAction {

//    Show Mensage in dialog!
//    public void actionPerformed(@NotNull AnActionEvent e) {
//        Messages.showMessageDialog("Hello World!", "PluginAndroidStudio", Messages.getInformationIcon());
//    }

    // File Chooser!
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        FileChooserDescriptor fileChooserDescriptor = new FileChooserDescriptor(false, true, false, false, false, false);
        fileChooserDescriptor.setTitle("My Demo Pick Directory");
        fileChooserDescriptor.setDescription("My file chooser demo");
        FileChooser.chooseFile(fileChooserDescriptor, e.getProject(), null);
    }


}
