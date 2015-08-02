package uk.co.haxyshideout.novachisel.blocks;


import nova.core.block.Block;
import nova.core.component.Category;
import nova.core.component.misc.Collider;
import nova.core.component.renderer.ItemRenderer;
import nova.core.component.renderer.StaticRenderer;
import nova.core.render.pipeline.BlockRenderStream;
import nova.core.render.texture.BlockTexture;

/**
 * Created by clienthax on 27/7/2015.
 */
public class GenericBlock extends Block {

	public String id;

	StaticRenderer staticRenderer = new StaticRenderer(this);

	public GenericBlock(String id, BlockTexture texture) {
		this.id = id;
		add(staticRenderer);
		add(new Collider(this));
		add(new ItemRenderer(this));
		staticRenderer.onRender(new BlockRenderStream(this).withTexture(texture).build());
	}

	public GenericBlock(String id, BlockTexture texture, String creativeTab) {
		this(id, texture);
		add(new Category(creativeTab));
	}

	@Override
	public String getID() {
		return id;
	}

}