
package model;


public class Friends {
    
    private int friendsID;
    private String friendName;
    private String emailAddr;
    private int age;
    private String faviroteColor;
    
    public Friends() {
        this.friendsID = 0;
        this.friendName = "";
        this.emailAddr = "";
        this.age = 0;
        this.faviroteColor = "";
    }

    public Friends(int friendsID, String friendName, String emailAddr, int age, String faviroteColor) {
        this.friendsID = friendsID;
        this.friendName = friendName;
        this.emailAddr = emailAddr;
        this.age = age;
        this.faviroteColor = faviroteColor;
    }

    public int getFriendsID() {
        return friendsID;
    }

    public void setFriendsID(int friendsID) {
        this.friendsID = friendsID;
    }

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFaviroteColor() {
        return faviroteColor;
    }

    public void setFaviroteColor(String faviroteColor) {
        this.faviroteColor = faviroteColor;
    }

    @Override
    public String toString() {
        return "Friends{" + "friendsID=" + friendsID + ", friendName=" + friendName + ", emailAddr=" + emailAddr + ", age=" + age + ", faviroteColor=" + faviroteColor + '}';
    }
    
    
    
  
    
}
