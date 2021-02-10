package converter.measure_line;

import java.util.Arrays;
import java.util.List;
//wnduhwubwubeuwb
public class GuitarMeasureLine extends MeasureLine {
    public int beats;
    public int beatType;

    public GuitarMeasureLine(String line, int beats, int beatType) {
        super(line);
        this.beats = beats;
        this.beatType = beatType;
    }

    public static boolean isGuitar(String line) {
        return true;
    }

    public static List<String> getLineNames() {
        String[] guitarMeasureNames = {"E", "A", "D", "G", "B", "e", "a", "d", "g", "b"};
        return Arrays.asList(guitarMeasureNames);
    }

    /**
     * TODO Validate that a given measure line string is a guitar measure line
     * by ensuring that the string name belongs in the list of guitar measure line
     * names only. If the measure line name belongs in both drums and guitar, you have to then
     * check the measure components, or "notes" to make sure that it belongs to guitars
     *
     */
    @Override
    public boolean validate() {
        //validate that the measure line components, or notes, are valid and as expected of a guitar measure line
        return false;
    }

    public String toXML() {
        
        return null;
    }

    public static String getComponentPatterns() {
        return "";
    }
}
