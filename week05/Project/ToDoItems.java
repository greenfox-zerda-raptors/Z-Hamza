package Project;


public class ToDoItems{
    String toDoItem;
    int number;
    boolean done;

    public ToDoItems() {

    }

    public ToDoItems(String toDoItem){
        this.toDoItem = toDoItem;
        this.done = false;
    }
    public ToDoItems(String toDoItem, String a){
        this.toDoItem = toDoItem;
        if(a.equals("true") || a.equals("yes") || a.equals("done") || a.equals( "[ x ]")){
            this.done=true;
        }
        else{
            this.done=false;
        }
    }
    public void Done(){
        this.done = true;
    }
    public void NotDone(){
        this.done = false;
    }
    public String getDone(){
        String a = new String();
        if(done == false){
            a= "[ 0 ]";
        }
        if(done == true) {
            a= "[ x ]";
        }
        return a;
    }

    public String toString() {
        return toDoItem;
    }


    public void settoDoItem(String toDoItem) {
        this.toDoItem= toDoItem;
    }

    public String gettoDoItem() {
        return toDoItem;
    }

}
