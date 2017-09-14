package designpatterns.observer.two;

public interface Observer {

	/**
	 * 更新接口
	 * @param subject 主题对象
	 */
	public void update(Subject subject);
}
