package ComputerStore;

public class Computer {
    String processor;
    int memory;

    Computer(String processor, int memory){
        this.processor = processor;
        this.memory = memory;
    }

    void printInfo(){
        System.out.println(processor + " " + memory);
    }

}
