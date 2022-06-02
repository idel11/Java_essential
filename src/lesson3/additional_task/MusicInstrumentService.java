package lesson3.additional_task;

import java.util.Optional;

public class MusicInstrumentService {

    private Instrument[] instrument;

    public MusicInstrumentService(Instrument[] instrument) {
        this.instrument = instrument;
    }

    public Optional<Instrument> findInstrumentById(int id) {
        for (Instrument t : instrument) {
            if (t.getId() == id) {
                return Optional.ofNullable(instrument[id - 1]);
            }
        }

        return Optional.empty();
    }


}
