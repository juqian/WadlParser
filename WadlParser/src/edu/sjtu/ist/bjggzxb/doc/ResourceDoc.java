package edu.sjtu.ist.bjggzxb.doc;

import java.util.ArrayList;
import com.google.gson.annotations.Since;

public class ResourceDoc {

	@Since(1.0)
	public String name;
	@Since(1.0)
	public String provider;
	@Since(1.0)
	public String minides;
	@Since(1.0)
	public String description;
	@Since(1.0)
	public ArrayList<ResourceRelation> relations;
}
