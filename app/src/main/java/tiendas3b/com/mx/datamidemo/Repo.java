package tiendas3b.com.mx.datamidemo;

public class Repo {

    private String full_name;
    private String name;
    private String node_id;
    private int id;

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNode_id() {
        return node_id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Repo{" +
                "full_name='" + full_name + '\'' +
                ", name='" + name + '\'' +
                ", node_id='" + node_id + '\'' +
                ", id=" + id +
                '}';
    }
}
