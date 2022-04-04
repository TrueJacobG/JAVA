import java.util.ArrayList;
import java.util.List;

public class Manager {

    public List<User> list = new ArrayList<>();

    public Manager(){
        run();
    }

    private void run(){
        list.add(new User("John", "Wrr", 123321123));
    }

    public int getLength(){
        return list.size();
    }
}
