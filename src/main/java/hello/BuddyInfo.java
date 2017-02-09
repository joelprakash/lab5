package hello;

import javax.persistence.*;


/**
 * Created by joelprakash on 1/12/2017.
 */
@Entity
public class BuddyInfo {

    private String name;
    private String phoneNo;




    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    protected BuddyInfo() {
    }

    /*
    public BuddyInfo(String name, String phoneNo) {
        this.name=name;
        this.phoneNo=phoneNo;
    }
*/
    public Long getId() {

        return id;
    }





    public String getName(){
        return this.name;
    }

    public String getPhoneNo(){
        return this.phoneNo;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }


//    public void setBuddyInfo(String name, String phoneNo){
//        this.name = name;
//        this.phoneNo = phoneNo;
//    }
//
//    @Override
//    public String toString() {
//        return "BuddyInfo{" +
//                "name='" + name + '\'' +
//                ", phoneNo=" + phoneNo +
//                '}';
//    }
}
