package stringmethods.filename;

public class FileNameManipulator {

    public char findLastCharacter(String fileName) {
        return fileName.charAt(fileName.length() - 1);
    }

    public String findFileExtension(String fileName) {
        return fileName.substring(fileName.indexOf(".") + 1).toLowerCase();
    }

    public boolean identifyFilesByExtension(String extension, String fileName) {
        return extension.equalsIgnoreCase(findFileExtension(fileName));
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName) {
        return actualFileName.equalsIgnoreCase(searchedFileName);
    }

    public String changeExtensionToLowerCase(String fileName) {
        return fileName.substring(0, fileName.indexOf(".") + 1).concat(findFileExtension(fileName));
    }

    public String replaceStringPart(String fileName, String presentPart, String targetPart) {
        return fileName.replace(presentPart, targetPart);
    }
}