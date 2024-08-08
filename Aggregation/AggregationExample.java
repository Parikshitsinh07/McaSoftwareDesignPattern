public class AggregationExample {
    public static void main(String[] args) {
       
        Department department = new Department("Engineering");

        
        Worker worker = new Worker("Parikshit", 101, department);

        worker.displayWorker();
    }
}
