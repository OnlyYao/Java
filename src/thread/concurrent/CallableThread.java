package thread.concurrent;

/*
 * JDK1.5之后，任务分为两类：一是实现Runnable接口，而是实现Callable接口。两者都可以被 ExecutorService 执行，但是 Runnable 任务没有返回值，
 * 而 Callable 任务有返回值。并且 Callable 的 call()方法只能通过 ExecutorService 的 submit(Callable task) 方法来执行，并且返回一个 Future，
 * 是表示任务等待完成的 Future。call()方法类上与run()方法。
 */
public class CallableThread {
	
}
