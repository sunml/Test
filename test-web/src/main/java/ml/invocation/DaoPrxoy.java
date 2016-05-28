package ml.invocation;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class DaoPrxoy implements MethodInterceptor {

	private Object target;

	/**
	 * 创建代理对象
	 * 
	 * @param target
	 * @return
	 */
	public Object getInstance(Object target) {
		this.target = target;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(this.target.getClass());
		// 回调方法
		enhancer.setCallback(this);
		// 创建代理对象
		return enhancer.create();
	}

	@Override
	public Object intercept(Object proxyObject, Method method, Object[] arg, MethodProxy proxyMethod) throws Throwable {
		System.out.println("start");
		Object object = proxyMethod.invokeSuper(proxyObject, arg);
		System.out.println("end");
		return object;
	}

}
