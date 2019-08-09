package report;

import java.util.LinkedList;
import java.util.List;

public class TabularData {

    //字段的名称
    public List<String> fieldNames = new LinkedList<String>();

    //数据
    public List<List<Object>> rows = new LinkedList<List<Object>>();

    //创建一个例子报表
    public static TabularData sampleData(){
        TabularData data = new TabularData();

        data.fieldNames.add("dept");
        data.fieldNames.add("num_person");
        data.fieldNames.add("sales_amount");

        List<Object> row1 = new LinkedList<Object>();
        row1.add("电话销售部");
        row1.add(10);
        row1.add(2345.0);
        data.rows.add(row1);

        List<Object> row2 = new LinkedList<Object>();
        row2.add("现场销售部");
        row2.add(20);
        row2.add(5860.0);
        data.rows.add(row2);

        List<Object> row3 = new LinkedList<Object>();
        row3.add("电子商务部");
        row3.add(15);
        row3.add(3045.0);
        data.rows.add(row3);

        return data;
    }
}
