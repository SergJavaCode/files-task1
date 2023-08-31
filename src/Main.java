import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    private static FileWriter writerTempTxt;

    public static void main(String[] args) {
        StringBuilder logFile = new StringBuilder();

        File srcDir = new File("c://Games/src");
        File resDir = new File("c://Games/res");
        File savegamesDir = new File("c://Games/savegames");
        File tempDir = new File("c://Games/temp");
        logFile.append(srcDir.mkdir()
                ? "Папка " + srcDir.toString() + " успешно создана. \n"
                : "Папка " + srcDir.toString() + " не создана. \n");
        logFile.append(resDir.mkdir()
                ? "Папка " + resDir.toString() + " успешно создана. \n"
                : "Папка " + resDir.toString() + " не создана. \n");
        logFile.append(savegamesDir.mkdir()
                ? "Папка " + savegamesDir.toString() + " успешно создана. \n"
                : "Папка " + savegamesDir.toString() + " не создана. \n");
        logFile.append(tempDir.mkdir()
                ? "Папка " + tempDir.toString() + " успешно создана. \n"
                : "Папка " + tempDir.toString() + " не создана. \n");

        File srcMainDir = new File("c://Games/src/main");
        File srcTestDir = new File("c://Games/src/test");
        logFile.append(srcMainDir.mkdir()
                ? "Папка " + srcMainDir.toString() + " успешно создана. \n"
                : "Папка " + srcMainDir.toString() + " не создана. \n");
        logFile.append(srcTestDir.mkdir()
                ? "Папка " + srcTestDir.toString() + " успешно создана. \n"
                : "Папка " + srcTestDir.toString() + " не создана. \n");


        File fileMainJava = new File("c://Games/src/main/Main.java");
        File fileUtilsJava = new File("c://Games/src/main/Utils.java");
        try {
            logFile.append(fileMainJava.createNewFile()
                    ? "Файл " + fileMainJava.toString() + " успешно создан. \n"
                    : "Файл " + fileMainJava.toString() + " не создан. \n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            logFile.append(fileUtilsJava.createNewFile()
                    ? "Файл " + fileUtilsJava.toString() + " успешно создан. \n"
                    : "Файл " + fileUtilsJava.toString() + " не создан. \n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File resDrawablesDir = new File("c://Games/res/drawables");
        File resVectorsDir = new File("c://Games/res/vectors");
        File resIconsDir = new File("c://Games/res/icons");
        logFile.append(resDrawablesDir.mkdir()
                ? "Папка " + resDrawablesDir.toString() + " успешно создана. \n"
                : "Папка " + resDrawablesDir.toString() + " не создана. \n");
        logFile.append(resVectorsDir.mkdir()
                ? "Папка " + resVectorsDir.toString() + " успешно создана. \n"
                : "Папка " + resVectorsDir.toString() + " не создана. \n");
        logFile.append(resIconsDir.mkdir()
                ? "Папка " + resIconsDir.toString() + " успешно создана. \n"
                : "Папка " + resIconsDir.toString() + " не создана. \n");

        File fileTempTxt = new File("c://Games/temp/temp.txt");
        try {
            logFile.append(fileTempTxt.createNewFile()
                    ? "Файл " + fileTempTxt.toString() + " успешно создан. \n"
                    : "Файл " + fileTempTxt.toString() + " не создан. \n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileWriter writerTempTxt = new FileWriter("c://Games/temp/temp.txt", false)) {
            writerTempTxt.write(logFile.toString());
            writerTempTxt.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}