package App;

/**
 * Created by evarmic on 30-Aug-18.
 *
 * For bean dependency (param "depends-on")
 */
public class Database {

    public Database() {
        connect();
    }

    private void connect() {
        System.out.println("Connected to database!");
    }
}
