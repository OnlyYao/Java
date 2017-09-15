package designpatterns.factory.method;

/*
 * ��������ģʽ
 * 
 * ��������ģʽ����Ĵ���ģʽ���������Ƕ���һ��������Ʒ����Ĺ����ӿڣ���ʵ�ʵĴ��������Ƴٵ�������
 * 
 * ʾ�������뵼�����ܡ�����Ա����н�ʽṹ����֧��HTML��PDF�ṹ���������������˶�HTML��PDF�ĽṹҪ������Щ��ͬ����ʱ���������ָ�ʽ�����ֽṹ
 *						       
 *                         __ExportHtmlFactory
 *    ExportFactory ----->|						(public ExportFile factory(String type))
 *                        |__ExportPdfFactory	
 *          
 *   																implements				
 *                         ����������ʵ��        __ExportStandardHtmlFile --------------> ExportFile
 *    ExportHtmlFactory  -------------->|							implements                  (public void export())
 *    				                    |__ExportFinancialHtmlFile --------------> ExportFile
 *    															  implements		
 *                         ����������ʵ��      __ExportStandardPdfFile --------------> ExportFile
 *    ExportPdfFactory  -------------->|                           implements					(public void export())	
 *    				                   |__ExportFinancialPdfFile --------------> ExportFile
 *    
 *    �൱�ڽ��򵥹���ģʽ�д���ʵ����"������"�����Ϊ���ڵ�"�����ӿ�"����"������"������ʵ����"��������"����"�����ӿ�"��
 *    �̳�"�����ӿ�"���ཫʹ�ü̳ж���"��������"��ɾ���ʵ���Ĵ���
 *    
 *    �͸������  ��������ģʽ�ǻ��ڼ򵥹���ģʽ�������ģ�ԭ�������ϵͳ���ڸ��ӣ�ʹ�ü򵥹���ģʽ�Ļ���ʹ����"������"����ޱ�ӷ�ף�
 *    ��ʹ�ù�������ģʽ�;Ϳ���"����"�������"����"�����������ֵ�����ʵ��������
 *    
 *    ʲôʱ���ʹ�����ֹ���ģʽ�أ�
 *    ������Ϊ��ϵͳ��Ҫ������ʵ���Ƚ϶�ʱ������ʹ�ù�������ģʽ�������Ҫ������ʵ������ʱ����ʹ�ü򵥹���ģʽ��
 */

/**
 * ���еĵ�����ʽ��ʵ����һ�ӿ�
 */
public interface Exportfactory {

	public ExportFile factory(String type);
}
