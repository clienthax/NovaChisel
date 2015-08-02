package uk.co.haxyshideout.novachisel.blocks;


import nova.core.block.Block;
import nova.core.component.Category;
import nova.core.component.misc.Collider;
import nova.core.component.renderer.ItemRenderer;
import nova.core.component.renderer.StaticRenderer;
import nova.core.render.pipeline.BlockRenderStream;
import nova.core.render.pipeline.ConnectedTextureRenderStream;
import nova.core.render.texture.BlockTexture;

/**
 * Created by clienthax on 27/7/2015.
 */
public class GenericCTMBlock extends Block {

	public String id;

	StaticRenderer staticRenderer = new StaticRenderer(this);

	public GenericCTMBlock(String id, BlockTexture texture, BlockTexture edgeTexture) {
		this.id = id;
		add(staticRenderer);
		add(new Collider(this));
		add(new ItemRenderer(this));
		staticRenderer.onRender(new ConnectedTextureRenderStream(this, edgeTexture).withFaceMask(0x3f).withTexture(edgeTexture).build());
		//	private val renderer = add(new ConnectedTextureRenderer(this, ElectricContent.solarPanelTextureEdge)).setFaceMask(2)
	}

	public GenericCTMBlock(String id, BlockTexture texture, BlockTexture connectedTexture, String creativeTab) {
		this(id, texture, connectedTexture);
		add(new Category(creativeTab));
	}

	@Override
	public String getID() {
		return id;
	}

}