package com.weilf;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;

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

	@Autowired
	private RepositoryService repositoryService;

	/**
	 * 根据key 部署任务
	 */
	@Test
	public void startTest(){
	//	ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("test001");
		Deployment test = repositoryService.createDeployment().name("复杂请假流程").addClasspathResource("bpmn/" + "test002.bpmn").deploy();
		System.out.println(test.getId());
		System.out.println(test.getKey());
		System.out.println(test.getName());
	}

	/**
	 * 根据流程定义的key 启动任务
	 */
	@Test
	public void startProcess(){
		/*ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("test00002");*/
		ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("test00002", "1");
		System.out.println(processInstance.getId());
		System.out.println(processInstance.getName());
	}


	/**
	 * 查询并完成任务
	 */
	@Test
	public void tastQuery(){
		Task task = taskService.createTaskQuery().processDefinitionId("test00002:1:4").singleResult();
	/*	HashMap<String, Object> dataMap = new HashMap<String, Object>();
		dataMap.put("day",2);
		taskService.complete(task.getId(),dataMap);*/
		taskService.complete(task.getId());
		 task = taskService.createTaskQuery().processDefinitionId("test00002:1:4").singleResult();
		System.out.println(task.getAssignee());
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
