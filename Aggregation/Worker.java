class Worker {
    String name;
    int employeeId;
    Department workerDepartment;  // Aggregation - Worker has a Department

    // Constructor
    public Worker(String name, int employeeId, Department workerDepartment) {
        this.name = name;
        this.employeeId = employeeId;
        this.workerDepartment = workerDepartment;
    }


    public void displayWorker() {
        System.out.println("Worker Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + workerDepartment.name);
    }
}