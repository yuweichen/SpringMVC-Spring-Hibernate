package ssm.service;

import java.util.List;

import ssm.model.vo.Auth;
import ssm.model.vo.TreeNode;

public interface AuthServiceI {

	public void add(Auth auth);
	
	public void edit(Auth auth);
	
	public void delete(Auth auth);

	public List<Auth> treegrid(Auth auth);
	/**
	 *	get tree of auth
	 * 
	 * @param auth
	 * @param b
	 *             true/false - recursion of child nodes
	 * @return
	 */
	public List<TreeNode> tree(Auth auth, boolean b);

}
