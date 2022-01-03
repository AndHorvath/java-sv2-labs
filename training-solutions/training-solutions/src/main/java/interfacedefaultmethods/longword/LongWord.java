package interfacedefaultmethods.longword;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongWord implements FileOperations {

    // --- attributes ---------------------------------------------------------

    private Path longWordPath;

    // --- constructors -------------------------------------------------------

    public LongWord(Path longWordPath) {
        this.longWordPath = longWordPath;
    }

    // --- getters and setters ------------------------------------------------


    public Path getLongWordPath() { return longWordPath; }

    // --- public methods -----------------------------------------------------

    @Override
    public String getLongWord() {
        List<String> longWordMatrix = readFromFile(longWordPath);
        List<Direction> directionList = initializeDirectionList(longWordMatrix);
        randomizeDirectionList(directionList);

        return getResult(longWordMatrix, directionList);
    }

    // --- private methods ----------------------------------------------------

    private List<Direction> initializeDirectionList(List<String> matrix) {
        List<Direction> directionList = new ArrayList<>();
        int numberOfRows = matrix.size() - 1;
        int numberOfColumns = matrix.get(0).length() - 1;

        for (int i = 0; i < numberOfColumns; i++) {
            directionList.add(Direction.RIGHT);
        }
        for (int i = 0; i < numberOfRows; i++) {
            directionList.add(Direction.DOWN);
        }
        return directionList;
    }

    private void randomizeDirectionList(List<Direction> directionList) {
        Collections.shuffle(directionList);
    }

    private String getResult(List<String> longWordMatrix, List<Direction> directionList) {
        int rowIndex = 0;
        int columnIndex = 0;
        StringBuilder result = new StringBuilder(
            getMatrixElement(longWordMatrix, rowIndex, columnIndex));

        for (Direction direction : directionList) {
            if (direction == Direction.RIGHT) {
                columnIndex++;
            } else {
                rowIndex++;
            }
            result.append(getMatrixElement(longWordMatrix, rowIndex, columnIndex));
        }
        return result.toString();
    }

    private String getMatrixElement(List<String> matrix, int i, int j) {
        return String.valueOf(matrix.get(i).charAt(j));
    }
}