package Reader;

import java.util.ResourceBundle;
import javax.swing.*;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;
import org.icepdf.ri.util.PropertiesManager;

public class PDFReader{

    public void PDFReader(String filePath){
        // Get a file from the command line to open

        // build a component controller
        SwingController controller = new SwingController();
        controller.setIsEmbeddedComponent(true);

        PropertiesManager properties = new PropertiesManager(System
                .getProperties(), ResourceBundle
                .getBundle(PropertiesManager.DEFAULT_MESSAGE_BUNDLE));

        properties.set(PropertiesManager.PROPERTY_DEFAULT_ZOOM_LEVEL, "1.75");

        SwingViewBuilder factory = new SwingViewBuilder(controller, properties);

        // add interactive mouse link annotation support via callback
        controller.getDocumentViewController().setAnnotationCallback(
                new org.icepdf.ri.common.MyAnnotationCallback(controller
                        .getDocumentViewController()));
        JPanel viewerComponentPanel = factory.buildViewerPanel();
        JFrame applicationFrame = new JFrame();
        applicationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        applicationFrame.getContentPane().add(viewerComponentPanel);
        // Now that the GUI is all in place, we can try openning a PDF
        controller.openDocument(filePath);
        // show the component
        applicationFrame.pack();
        applicationFrame.setVisible(true);
    }


}

