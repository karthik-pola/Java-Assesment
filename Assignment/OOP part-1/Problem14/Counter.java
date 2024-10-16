public class Counter {
    private int number;

    public Counter(int number){
        this.number = number;
    }

    public Counter(){
        this.number = 0;
    }

    int getNumber(){
        return number;
    }

    void setNumber(int number){
        this.number = number;
    }

    void incrementNumber(){
        this.number++;
    }

    void decrementNumber(){
        this.number--;
    }

}
