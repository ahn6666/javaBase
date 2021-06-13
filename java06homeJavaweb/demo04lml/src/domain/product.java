package domain;

public class product {
    private Integer id;
    private String pname;
    private float pprice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public float getPprice() {
        return pprice;
    }

    public void setPprice(float pprice) {
        this.pprice = pprice;
    }

    @Override
    public String toString() {
        return "product{" +
                "id=" + id +
                ", pname='" + pname + '\'' +
                ", pprice=" + pprice +
                '}';
    }
}
