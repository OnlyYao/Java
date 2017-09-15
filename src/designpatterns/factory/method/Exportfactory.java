package designpatterns.factory.method;

/*
 * 工厂方法模式
 * 
 * 工厂方法模式是类的创建模式，其用意是定义一个创建产品对象的工厂接口，将实际的创建工作推迟到子类中
 * 
 * 示例：导入导出功能。导出员工的薪资结构，并支持HTML和PDF结构，而财务与其他人对HTML和PDF的结构要求又有些不同，这时就有了两种格式，四种结构
 *						       
 *                         __ExportHtmlFactory
 *    ExportFactory ----->|						(public ExportFile factory(String type))
 *                        |__ExportPdfFactory	
 *          
 *   																implements				
 *                         生产这两种实例        __ExportStandardHtmlFile --------------> ExportFile
 *    ExportHtmlFactory  -------------->|							implements                  (public void export())
 *    				                    |__ExportFinancialHtmlFile --------------> ExportFile
 *    															  implements		
 *                         生产这两种实例      __ExportStandardPdfFile --------------> ExportFile
 *    ExportPdfFactory  -------------->|                           implements					(public void export())	
 *    				                   |__ExportFinancialPdfFile --------------> ExportFile
 *    
 *    相当于将简单工厂模式中创建实例的"工厂类"抽象成为现在的"工厂接口"，而"工厂类"中生产实例的"工厂方法"抽象到"工厂接口"中
 *    继承"工厂接口"的类将使用继承而来"工厂方法"完成具体实例的创建
 *    
 *    就个人理解  工厂方法模式是基于简单工厂模式而产生的，原因是如果系统过于复杂，使用简单工厂模式的话会使得其"工厂类"变的无比臃肿，
 *    而使用工厂方法模式就就可以"减轻"工厂类的"负担"，让子类来分担生产实例的任务。
 *    
 *    什么时候该使用哪种工厂模式呢？
 *    个人认为当系统需要生产的实例比较多时，就是使用工厂方法模式，如果需要创建的实例不多时，就使用简单工厂模式。
 */

/**
 * 所有的导出格式都实现这一接口
 */
public interface Exportfactory {

	public ExportFile factory(String type);
}
