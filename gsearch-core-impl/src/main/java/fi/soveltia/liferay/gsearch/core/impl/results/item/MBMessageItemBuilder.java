
package fi.soveltia.liferay.gsearch.core.impl.results.item;

import org.osgi.service.component.annotations.Component;

/**
 * MB message result item builder.
 * 
 * @author Petteri Karttunen
 */
@Component(
	immediate = true
)
public class MBMessageItemBuilder extends BaseResultItemBuilder {

	/**
	 * {@inheritDoc}
	 * @throws Exception  
	 */
	@Override
	public String getImageSrc() throws Exception {

		// return _portletRequest.getContextPath() + DEFAULT_IMAGE;
		return null;
	}

	public static final String DEFAULT_IMAGE = "/o/gsearch-web/images//asset-types/discussion.png";
}
