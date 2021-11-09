package stringmethods.filename;

public class FileNameManipulatorMain {

    public static void main(String[] args) {
        FileNameManipulator fileNameManipulator = new FileNameManipulator();
        String testFileName = "Jeremy_Doe.Class";

        System.out.println(fileNameManipulator.findLastCharacter(testFileName));
        System.out.println(fileNameManipulator.findFileExtension(testFileName));
        System.out.println(fileNameManipulator.identifyFilesByExtension("class", testFileName));
        System.out.println(fileNameManipulator.identifyFilesByExtension("jar", testFileName));
        System.out.println(fileNameManipulator.compareFilesByName("JEREMY_DOE.class", testFileName));
        System.out.println(fileNameManipulator.compareFilesByName("Joanna_Doe.class", testFileName));
        System.out.println(fileNameManipulator.changeExtensionToLowerCase(testFileName));
        System.out.println(fileNameManipulator.replaceStringPart(testFileName, "Jeremy", "Joanna"));
    }
}