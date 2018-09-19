import java.awt.*;

public class RegistrationForm extends Frame {

    Label nameLabel;
    Label ageLabel;
    Label subjectLabel;
    Label modeLabel;
    TextField nameTextField;
    TextField ageTextField;
    Checkbox subjectCheckbox1;
    Checkbox modeCheckbox1;
    Checkbox subjectCheckbox2;
    Checkbox modeCheckbox2;
    Button saveBtn;
    Button exitBtn;
    Button clearBtn;    
    Panel gridPanel;
    Panel bottomPanel;
    Frame mainWindow;

    public RegistrationForm() {
        initComponent();
    }

    public void initComponent() {
        setVisible(true);
        setSize(500,500);        
        Panel gridPanel = new Panel(new GridLayout(4,2));
        Panel bottomPanel = new Panel(new FlowLayout());


        nameLabel = new Label("Name");                
        ageLabel = new Label("Age");
        modeLabel = new Label("Mode(s)");
        subjectLabel = new Label("Subject(s)");
        nameTextField = new TextField();
        ageTextField = new TextField();
        modeCheckbox1 = new Checkbox("Class");
        subjectCheckbox1 = new Checkbox("Java");
        modeCheckbox2 = new Checkbox("Online");
        subjectCheckbox2 = new Checkbox("PHP");
        Panel mdchkBoxPanel = new Panel(new FlowLayout());
        Panel sbjchkBoxPanel = new Panel(new FlowLayout());
        gridPanel.add(nameLabel);
        gridPanel.add(nameTextField);
        gridPanel.add(ageLabel);
        gridPanel.add(ageTextField);
        gridPanel.add(subjectLabel);
       
        mdchkBoxPanel.add(modeCheckbox1);
        mdchkBoxPanel.add(modeCheckbox2);
        sbjchkBoxPanel.add(subjectCheckbox1);
        sbjchkBoxPanel.add(subjectCheckbox2);
        
        gridPanel.add(sbjchkBoxPanel);
        gridPanel.add(modeLabel);
        gridPanel.add(mdchkBoxPanel);
        
        
        saveBtn = new Button("Save");
        exitBtn = new Button("Exit");
        clearBtn = new Button("Clear");
        bottomPanel.add(saveBtn);
        bottomPanel.add(exitBtn);
        bottomPanel.add(clearBtn);
        add("North",gridPanel);
        add("South",bottomPanel);

    }

    public static void main(String args[]) {
        RegistrationForm form = new RegistrationForm();
    }
}