# MySQLUtils
I develop this tool based on the java package [Apache Commons DbUtils](https://commons.apache.org/proper/commons-dbutils/). 

**This tool provides an easy-to-use interface to operate mysql database.**

**Also, this tool supports XML database configuration and Java Bean.**

**Function**:  

query, update and insert data.


# Example
The configuration parameters for mysql：

>>>connectURI：127.0.0.1:3306

>>>database name：crawler

>>>user name：root

>>>password：112233

 The operational table is 'carsales'. The data in this table is as follows:
 
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190626103413611.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9xaWFueWFuZy1oZnV0LmJsb2cuY3Nkbi5uZXQ=,size_16,color_FFFFFF,t_70)

## Query One Column
The code for querying one column data is as follows：

```java
package com.test;

import java.util.List;

import com.db.MYSQLControl;

public class QueryOneColumn {

	public static void main(String[] args)  {
		MYSQLControl control = new MYSQLControl("127.0.0.1:3306", "crawler", "root", "112233");
		List<Object> list = control.getListOneBySQL("select month from carsales", "month");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
}
```

Running this code, we can obtain the following results:
```
2007-01-01
2007-02-01
2007-03-01
2007-04-01
2007-05-01
2007-06-01
2007-07-01
2007-08-01
2007-09-01
2007-10-01
2007-11-01
...
```

## Update Data
The code for updating table is as follows：
```java
package com.test;

import com.db.MYSQLControl;

public class UpdateData {

	public static void main(String[] args) {
		MYSQLControl control = new MYSQLControl("127.0.0.1:3306", "crawler", "root", "112233");
		control.executeUpdate("update carsales set sales = '4000' "
				+ "where month = '2007-10-01'");
		System.out.println("finish updating!");
	}
}
```

Running this code, we can find that:

![在这里插入图片描述](https://img-blog.csdnimg.cn/20190626105136307.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9xaWFueWFuZy1oZnV0LmJsb2cuY3Nkbi5uZXQ=,size_16,color_FFFFFF,t_70)


