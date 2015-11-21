/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Nov 18, 2015 5:26:13 PM                     ---
 * ----------------------------------------------------------------
 */
package org.training.service.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.extension.Extension;
import java.util.HashMap;
import java.util.Map;
import org.training.service.constants.TrainingservicesConstants;

/**
 * Generated class for type <code>TrainingservicesManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedTrainingservicesManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	@Override
	public String getName()
	{
		return TrainingservicesConstants.EXTENSIONNAME;
	}
	
}
