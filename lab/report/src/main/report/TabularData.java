package report;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TabularData {

    //字段的名称
    public List<String> fieldNames = new LinkedList<String>();

    //数据，按列存储
    public List<List<Object>> cols = new LinkedList<List<Object>>();

    public int getNumRows(){
        int rtn = 0;
        if (cols.size()>0){
            rtn = cols.get(0).size();
        }
        return rtn;
    }

    /**
     * 添加新列。
     * @param fieldName 字段名称，有可能是公式。
     * @param col 这一列的数据。
     */
    public void addColumn(String fieldName, List<Object> col){
        fieldNames.add(fieldName);
        cols.add(col);
    }

    //创建一个例子报表
    public static TabularData sampleData(){
        TabularData data = new TabularData();

        data.fieldNames.add("dept");
        data.fieldNames.add("num_person");
        data.fieldNames.add("sales_amount");

        List<Object> col1 = new ArrayList<Object>();
        col1.add("电话销售部");
        col1.add("现场销售部");
        col1.add("电子商务部");
        data.cols.add(col1);

        List<Object> col2 = new ArrayList<Object>();
        col2.add(10);
        col2.add(20);
        col2.add(15);
        data.cols.add(col2);

        List<Object> col3 = new ArrayList<Object>();
        col3.add(2345.0);
        col3.add(5860.0);
        col3.add(3045.0);
        data.cols.add(col3);

        return data;
    }
}
