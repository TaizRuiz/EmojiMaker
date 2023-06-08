module com.mycompany.emojimaker {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.emojimaker to javafx.fxml;
    exports com.mycompany.emojimaker;
}
