@ATest(name="nameClass",type="tableClass",version="12")
public class Test {

	private String tableName;
	
	private String tableType;
	
	private String tableVersion;

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getTableType() {
		return tableType;
	}

	public void setTableType(String tableType) {
		this.tableType = tableType;
	}

	public String getTableVersion() {
		return tableVersion;
	}

	public void setTableVersion(String tableVersion) {
		this.tableVersion = tableVersion;
	}

	@Override
	public String toString() {
		return "Test [tableName=" + tableName + ", tableType=" + tableType + ", tableVersion=" + tableVersion + "]";
	}
	
}
