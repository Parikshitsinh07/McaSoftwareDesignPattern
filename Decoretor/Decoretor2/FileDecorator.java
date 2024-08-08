public abstract class FileDecorator implements FileHendeler {
    private File file;

    public DataSourceDecorator(File file) {
        this.file = file;
    }

    abstract public void writeData(String data);
    abstract public String readData();
}
