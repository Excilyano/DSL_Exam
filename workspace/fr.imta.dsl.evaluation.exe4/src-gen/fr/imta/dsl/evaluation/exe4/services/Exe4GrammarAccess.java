/*
* generated by Xtext
*/
package fr.imta.dsl.evaluation.exe4.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class Exe4GrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Assignment cFramesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cFramesFrameParserRuleCall_0 = (RuleCall)cFramesAssignment.eContents().get(0);
		
		//Model:
		//	frames+=Frame*;
		public ParserRule getRule() { return rule; }

		//frames+=Frame*
		public Assignment getFramesAssignment() { return cFramesAssignment; }

		//Frame
		public RuleCall getFramesFrameParserRuleCall_0() { return cFramesFrameParserRuleCall_0; }
	}

	public class FrameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Frame");
		private final UnorderedGroup cUnorderedGroup = (UnorderedGroup)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cUnorderedGroup.eContents().get(0);
		private final Keyword cFrameKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cNameAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0_1_0 = (RuleCall)cNameAssignment_0_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Assignment cTitleAssignment_0_3 = (Assignment)cGroup_0.eContents().get(3);
		private final RuleCall cTitleTitleParserRuleCall_0_3_0 = (RuleCall)cTitleAssignment_0_3.eContents().get(0);
		private final Assignment cWidthAssignment_1 = (Assignment)cUnorderedGroup.eContents().get(1);
		private final RuleCall cWidthWidthParserRuleCall_1_0 = (RuleCall)cWidthAssignment_1.eContents().get(0);
		private final Assignment cHeightAssignment_2 = (Assignment)cUnorderedGroup.eContents().get(2);
		private final RuleCall cHeightHeightParserRuleCall_2_0 = (RuleCall)cHeightAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cUnorderedGroup.eContents().get(3);
		private final Assignment cContentAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cContentContentParserRuleCall_3_0_0 = (RuleCall)cContentAssignment_3_0.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		
		//Frame:
		//	"frame" name=ID "{" title=Title & width=Width & height=Height & content=Content "}";
		public ParserRule getRule() { return rule; }

		//"frame" name=ID "{" title=Title & width=Width & height=Height & content=Content "}"
		public UnorderedGroup getUnorderedGroup() { return cUnorderedGroup; }

		//"frame" name=ID "{" title=Title
		public Group getGroup_0() { return cGroup_0; }

		//"frame"
		public Keyword getFrameKeyword_0_0() { return cFrameKeyword_0_0; }

		//name=ID
		public Assignment getNameAssignment_0_1() { return cNameAssignment_0_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_1_0() { return cNameIDTerminalRuleCall_0_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_0_2() { return cLeftCurlyBracketKeyword_0_2; }

		//title=Title
		public Assignment getTitleAssignment_0_3() { return cTitleAssignment_0_3; }

		//Title
		public RuleCall getTitleTitleParserRuleCall_0_3_0() { return cTitleTitleParserRuleCall_0_3_0; }

		//width=Width
		public Assignment getWidthAssignment_1() { return cWidthAssignment_1; }

		//Width
		public RuleCall getWidthWidthParserRuleCall_1_0() { return cWidthWidthParserRuleCall_1_0; }

		//height=Height
		public Assignment getHeightAssignment_2() { return cHeightAssignment_2; }

		//Height
		public RuleCall getHeightHeightParserRuleCall_2_0() { return cHeightHeightParserRuleCall_2_0; }

		//content=Content "}"
		public Group getGroup_3() { return cGroup_3; }

		//content=Content
		public Assignment getContentAssignment_3_0() { return cContentAssignment_3_0; }

		//Content
		public RuleCall getContentContentParserRuleCall_3_0_0() { return cContentContentParserRuleCall_3_0_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3_1() { return cRightCurlyBracketKeyword_3_1; }
	}

	public class TitleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Title");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTitleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Title:
		//	"title:" name=STRING;
		public ParserRule getRule() { return rule; }

		//"title:" name=STRING
		public Group getGroup() { return cGroup; }

		//"title:"
		public Keyword getTitleKeyword_0() { return cTitleKeyword_0; }

		//name=STRING
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }
	}

	public class WidthElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Width");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWidthKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//Width:
		//	"width:" value=INT;
		public ParserRule getRule() { return rule; }

		//"width:" value=INT
		public Group getGroup() { return cGroup; }

		//"width:"
		public Keyword getWidthKeyword_0() { return cWidthKeyword_0; }

		//value=INT
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }

		//INT
		public RuleCall getValueINTTerminalRuleCall_1_0() { return cValueINTTerminalRuleCall_1_0; }
	}

	public class HeightElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Height");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHeightKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//Height:
		//	"height:" value=INT;
		public ParserRule getRule() { return rule; }

		//"height:" value=INT
		public Group getGroup() { return cGroup; }

		//"height:"
		public Keyword getHeightKeyword_0() { return cHeightKeyword_0; }

		//value=INT
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }

		//INT
		public RuleCall getValueINTTerminalRuleCall_1_0() { return cValueINTTerminalRuleCall_1_0; }
	}

	public class ContentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Content");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cContentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cComponentsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cComponentsComponentParserRuleCall_2_0 = (RuleCall)cComponentsAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Content:
		//	"content" "{" components+=Component+ "}";
		public ParserRule getRule() { return rule; }

		//"content" "{" components+=Component+ "}"
		public Group getGroup() { return cGroup; }

		//"content"
		public Keyword getContentKeyword_0() { return cContentKeyword_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//components+=Component+
		public Assignment getComponentsAssignment_2() { return cComponentsAssignment_2; }

		//Component
		public RuleCall getComponentsComponentParserRuleCall_2_0() { return cComponentsComponentParserRuleCall_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}

	public class ComponentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Component");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cLabelParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cButtonParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Component:
		//	Label | Button;
		public ParserRule getRule() { return rule; }

		//Label | Button
		public Alternatives getAlternatives() { return cAlternatives; }

		//Label
		public RuleCall getLabelParserRuleCall_0() { return cLabelParserRuleCall_0; }

		//Button
		public RuleCall getButtonParserRuleCall_1() { return cButtonParserRuleCall_1; }
	}

	public class LabelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Label");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLabelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//Label:
		//	"label:" value=STRING;
		public ParserRule getRule() { return rule; }

		//"label:" value=STRING
		public Group getGroup() { return cGroup; }

		//"label:"
		public Keyword getLabelKeyword_0() { return cLabelKeyword_0; }

		//value=STRING
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_1_0() { return cValueSTRINGTerminalRuleCall_1_0; }
	}

	public class ButtonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Button");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cButtonKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cDestAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cDestFrameCrossReference_3_0 = (CrossReference)cDestAssignment_3.eContents().get(0);
		private final RuleCall cDestFrameIDTerminalRuleCall_3_0_1 = (RuleCall)cDestFrameCrossReference_3_0.eContents().get(1);
		
		//Button:
		//	"button:" value=STRING "->" dest=[Frame];
		public ParserRule getRule() { return rule; }

		//"button:" value=STRING "->" dest=[Frame]
		public Group getGroup() { return cGroup; }

		//"button:"
		public Keyword getButtonKeyword_0() { return cButtonKeyword_0; }

		//value=STRING
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_1_0() { return cValueSTRINGTerminalRuleCall_1_0; }

		//"->"
		public Keyword getHyphenMinusGreaterThanSignKeyword_2() { return cHyphenMinusGreaterThanSignKeyword_2; }

		//dest=[Frame]
		public Assignment getDestAssignment_3() { return cDestAssignment_3; }

		//[Frame]
		public CrossReference getDestFrameCrossReference_3_0() { return cDestFrameCrossReference_3_0; }

		//ID
		public RuleCall getDestFrameIDTerminalRuleCall_3_0_1() { return cDestFrameIDTerminalRuleCall_3_0_1; }
	}
	
	
	private ModelElements pModel;
	private FrameElements pFrame;
	private TitleElements pTitle;
	private WidthElements pWidth;
	private HeightElements pHeight;
	private ContentElements pContent;
	private ComponentElements pComponent;
	private LabelElements pLabel;
	private ButtonElements pButton;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public Exe4GrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.imta.dsl.evaluation.exe4.Exe4".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	frames+=Frame*;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Frame:
	//	"frame" name=ID "{" title=Title & width=Width & height=Height & content=Content "}";
	public FrameElements getFrameAccess() {
		return (pFrame != null) ? pFrame : (pFrame = new FrameElements());
	}
	
	public ParserRule getFrameRule() {
		return getFrameAccess().getRule();
	}

	//Title:
	//	"title:" name=STRING;
	public TitleElements getTitleAccess() {
		return (pTitle != null) ? pTitle : (pTitle = new TitleElements());
	}
	
	public ParserRule getTitleRule() {
		return getTitleAccess().getRule();
	}

	//Width:
	//	"width:" value=INT;
	public WidthElements getWidthAccess() {
		return (pWidth != null) ? pWidth : (pWidth = new WidthElements());
	}
	
	public ParserRule getWidthRule() {
		return getWidthAccess().getRule();
	}

	//Height:
	//	"height:" value=INT;
	public HeightElements getHeightAccess() {
		return (pHeight != null) ? pHeight : (pHeight = new HeightElements());
	}
	
	public ParserRule getHeightRule() {
		return getHeightAccess().getRule();
	}

	//Content:
	//	"content" "{" components+=Component+ "}";
	public ContentElements getContentAccess() {
		return (pContent != null) ? pContent : (pContent = new ContentElements());
	}
	
	public ParserRule getContentRule() {
		return getContentAccess().getRule();
	}

	//Component:
	//	Label | Button;
	public ComponentElements getComponentAccess() {
		return (pComponent != null) ? pComponent : (pComponent = new ComponentElements());
	}
	
	public ParserRule getComponentRule() {
		return getComponentAccess().getRule();
	}

	//Label:
	//	"label:" value=STRING;
	public LabelElements getLabelAccess() {
		return (pLabel != null) ? pLabel : (pLabel = new LabelElements());
	}
	
	public ParserRule getLabelRule() {
		return getLabelAccess().getRule();
	}

	//Button:
	//	"button:" value=STRING "->" dest=[Frame];
	public ButtonElements getButtonAccess() {
		return (pButton != null) ? pButton : (pButton = new ButtonElements());
	}
	
	public ParserRule getButtonRule() {
		return getButtonAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}