module sudoku.sudokugame {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens sudoku.sudokugame to javafx.fxml;
    exports sudoku.sudokugame;
}