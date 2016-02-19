package ch.epfl.lsi.ironICpp.electrodeFactory;

/**
 * Created by Thieb on 19.02.2016.
 */
public class LactateMeasure implements Measurement {

    private double value;
    private String streamId;

    public LactateMeasure(double value) {
        this.value = value;
    }

    @Override
    public void save() {
        // TODO: Pryv's library
    }
}