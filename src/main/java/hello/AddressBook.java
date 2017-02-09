package hello;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by joelprakash on 1/12/2017.
 */

@Entity
public class AddressBook {



   @OneToMany (cascade = CascadeType.ALL)
    public List<BuddyInfo> buddyInfoList;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long    id;

    public Long getId() {
        return this.id;
    }


    protected AddressBook() {

    }

    public AddressBook(List<BuddyInfo> buddyInfoList) {
        this.buddyInfoList = new ArrayList<BuddyInfo>();
        this.buddyInfoList = buddyInfoList;
    }

    public List<BuddyInfo> getBuddyInfoList() {
        return buddyInfoList;
    }

    public void setBuddyInfoList(List<BuddyInfo> buddyInfoList) {
        this.buddyInfoList = buddyInfoList;
    }

    public void setBuddyInfo (BuddyInfo buddy){
        this.buddyInfoList.add(buddy);
    }

    public void deleteBuddyInfo (BuddyInfo buddy){
        this.buddyInfoList.remove(buddy);
    }

   @Override
    public String toString() {
        String list = "";
        for (int i = 0; i < buddyInfoList.size(); i++) {
            list += buddyInfoList.get(i).toString() + "\n"
                    ;
        }
        return list;
    }



}
