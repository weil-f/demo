package com.weilf;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Package: com.weilf
 * Date: Created in 2020-04-20 17:15
 *
 * @Version: 1.0.0
 * @author: weilai
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ActivitiApplicationTest {

	@Autowired
	private RuntimeService runtimeService;

	@Autowired
	private TaskService taskService;

	@Test
	public void startTest(){
		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("hello");
		System.out.println(processInstance.getName());
	}

	@Test
	public void overTask(){
		Task zhangsan = taskService.createTaskQuery().taskAssignee("zhangsan").singleResult();
		System.out.println(zhangsan);
		if(zhangsan != null){
			taskService.complete(zhangsan.getId());
			zhangsan = taskService.createTaskQuery().taskAssignee("zhangsan").singleResult();
			System.out.println(zhangsan);
		}
	}
}
