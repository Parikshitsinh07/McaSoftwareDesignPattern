abstract class DataSourceDecorator implements DataSource {
    private DataSource ds;

    DataSourceDecorator(DataSource source) {
        this.ds = source;
    }

    public void writeData(String data) {
        ds.writeData(data);
    }

    public String readData() {
        return ds.readData();
    }
}