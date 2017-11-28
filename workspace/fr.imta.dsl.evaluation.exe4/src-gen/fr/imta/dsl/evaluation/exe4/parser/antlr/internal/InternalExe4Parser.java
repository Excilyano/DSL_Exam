package fr.imta.dsl.evaluation.exe4.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.imta.dsl.evaluation.exe4.services.Exe4GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExe4Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'frame'", "'{'", "'}'", "'title:'", "'width:'", "'height:'", "'content'", "'label:'", "'button:'", "'->'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalExe4Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExe4Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExe4Parser.tokenNames; }
    public String getGrammarFileName() { return "../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g"; }



     	private Exe4GrammarAccess grammarAccess;
     	
        public InternalExe4Parser(TokenStream input, Exe4GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected Exe4GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:76:1: ruleModel returns [EObject current=null] : ( (lv_frames_0_0= ruleFrame ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_frames_0_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:79:28: ( ( (lv_frames_0_0= ruleFrame ) )* )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:80:1: ( (lv_frames_0_0= ruleFrame ) )*
            {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:80:1: ( (lv_frames_0_0= ruleFrame ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=15 && LA1_0<=17)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:81:1: (lv_frames_0_0= ruleFrame )
            	    {
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:81:1: (lv_frames_0_0= ruleFrame )
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:82:3: lv_frames_0_0= ruleFrame
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getFramesFrameParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFrame_in_ruleModel130);
            	    lv_frames_0_0=ruleFrame();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"frames",
            	            		lv_frames_0_0, 
            	            		"Frame");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFrame"
    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:106:1: entryRuleFrame returns [EObject current=null] : iv_ruleFrame= ruleFrame EOF ;
    public final EObject entryRuleFrame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrame = null;


        try {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:107:2: (iv_ruleFrame= ruleFrame EOF )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:108:2: iv_ruleFrame= ruleFrame EOF
            {
             newCompositeNode(grammarAccess.getFrameRule()); 
            pushFollow(FOLLOW_ruleFrame_in_entryRuleFrame166);
            iv_ruleFrame=ruleFrame();

            state._fsp--;

             current =iv_ruleFrame; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFrame176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFrame"


    // $ANTLR start "ruleFrame"
    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:115:1: ruleFrame returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'frame' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_title_4_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_width_5_0= ruleWidth ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_height_6_0= ruleHeight ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_content_7_0= ruleContent ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleFrame() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_8=null;
        EObject lv_title_4_0 = null;

        EObject lv_width_5_0 = null;

        EObject lv_height_6_0 = null;

        EObject lv_content_7_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:118:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'frame' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_title_4_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_width_5_0= ruleWidth ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_height_6_0= ruleHeight ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_content_7_0= ruleContent ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) ) ) )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:119:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'frame' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_title_4_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_width_5_0= ruleWidth ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_height_6_0= ruleHeight ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_content_7_0= ruleContent ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) ) )
            {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:119:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'frame' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_title_4_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_width_5_0= ruleWidth ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_height_6_0= ruleHeight ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_content_7_0= ruleContent ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) ) )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:121:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'frame' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_title_4_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_width_5_0= ruleWidth ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_height_6_0= ruleHeight ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_content_7_0= ruleContent ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) )
            {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:121:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'frame' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_title_4_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_width_5_0= ruleWidth ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_height_6_0= ruleHeight ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_content_7_0= ruleContent ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:122:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'frame' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_title_4_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_width_5_0= ruleWidth ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_height_6_0= ruleHeight ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_content_7_0= ruleContent ) ) otherlv_8= '}' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getFrameAccess().getUnorderedGroup());
            	
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:125:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'frame' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_title_4_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_width_5_0= ruleWidth ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_height_6_0= ruleHeight ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_content_7_0= ruleContent ) ) otherlv_8= '}' ) ) ) ) )+ {...}?)
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:126:3: ( ({...}? => ( ({...}? => (otherlv_1= 'frame' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_title_4_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_width_5_0= ruleWidth ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_height_6_0= ruleHeight ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_content_7_0= ruleContent ) ) otherlv_8= '}' ) ) ) ) )+ {...}?
            {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:126:3: ( ({...}? => ( ({...}? => (otherlv_1= 'frame' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_title_4_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_width_5_0= ruleWidth ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_height_6_0= ruleHeight ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_content_7_0= ruleContent ) ) otherlv_8= '}' ) ) ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=5;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:128:4: ({...}? => ( ({...}? => (otherlv_1= 'frame' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_title_4_0= ruleTitle ) ) ) ) ) )
            	    {
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:128:4: ({...}? => ( ({...}? => (otherlv_1= 'frame' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_title_4_0= ruleTitle ) ) ) ) ) )
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:129:5: {...}? => ( ({...}? => (otherlv_1= 'frame' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_title_4_0= ruleTitle ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:129:100: ( ({...}? => (otherlv_1= 'frame' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_title_4_0= ruleTitle ) ) ) ) )
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:130:6: ({...}? => (otherlv_1= 'frame' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_title_4_0= ruleTitle ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFrameAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:133:6: ({...}? => (otherlv_1= 'frame' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_title_4_0= ruleTitle ) ) ) )
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:133:7: {...}? => (otherlv_1= 'frame' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_title_4_0= ruleTitle ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "true");
            	    }
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:133:16: (otherlv_1= 'frame' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_title_4_0= ruleTitle ) ) )
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:133:18: otherlv_1= 'frame' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_title_4_0= ruleTitle ) )
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleFrame258); 

            	        	newLeafNode(otherlv_1, grammarAccess.getFrameAccess().getFrameKeyword_0_0());
            	        
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:137:1: ( (lv_name_2_0= RULE_ID ) )
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:138:1: (lv_name_2_0= RULE_ID )
            	    {
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:138:1: (lv_name_2_0= RULE_ID )
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:139:3: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFrame275); 

            	    			newLeafNode(lv_name_2_0, grammarAccess.getFrameAccess().getNameIDTerminalRuleCall_0_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getFrameRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"name",
            	            		lv_name_2_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleFrame292); 

            	        	newLeafNode(otherlv_3, grammarAccess.getFrameAccess().getLeftCurlyBracketKeyword_0_2());
            	        
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:159:1: ( (lv_title_4_0= ruleTitle ) )
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:160:1: (lv_title_4_0= ruleTitle )
            	    {
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:160:1: (lv_title_4_0= ruleTitle )
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:161:3: lv_title_4_0= ruleTitle
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFrameAccess().getTitleTitleParserRuleCall_0_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTitle_in_ruleFrame313);
            	    lv_title_4_0=ruleTitle();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFrameRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_4_0, 
            	            		"Title");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFrameAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:184:4: ({...}? => ( ({...}? => ( (lv_width_5_0= ruleWidth ) ) ) ) )
            	    {
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:184:4: ({...}? => ( ({...}? => ( (lv_width_5_0= ruleWidth ) ) ) ) )
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:185:5: {...}? => ( ({...}? => ( (lv_width_5_0= ruleWidth ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:185:100: ( ({...}? => ( (lv_width_5_0= ruleWidth ) ) ) )
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:186:6: ({...}? => ( (lv_width_5_0= ruleWidth ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFrameAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:189:6: ({...}? => ( (lv_width_5_0= ruleWidth ) ) )
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:189:7: {...}? => ( (lv_width_5_0= ruleWidth ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "true");
            	    }
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:189:16: ( (lv_width_5_0= ruleWidth ) )
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:190:1: (lv_width_5_0= ruleWidth )
            	    {
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:190:1: (lv_width_5_0= ruleWidth )
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:191:3: lv_width_5_0= ruleWidth
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFrameAccess().getWidthWidthParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWidth_in_ruleFrame389);
            	    lv_width_5_0=ruleWidth();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFrameRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"width",
            	            		lv_width_5_0, 
            	            		"Width");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFrameAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:214:4: ({...}? => ( ({...}? => ( (lv_height_6_0= ruleHeight ) ) ) ) )
            	    {
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:214:4: ({...}? => ( ({...}? => ( (lv_height_6_0= ruleHeight ) ) ) ) )
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:215:5: {...}? => ( ({...}? => ( (lv_height_6_0= ruleHeight ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:215:100: ( ({...}? => ( (lv_height_6_0= ruleHeight ) ) ) )
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:216:6: ({...}? => ( (lv_height_6_0= ruleHeight ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFrameAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:219:6: ({...}? => ( (lv_height_6_0= ruleHeight ) ) )
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:219:7: {...}? => ( (lv_height_6_0= ruleHeight ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "true");
            	    }
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:219:16: ( (lv_height_6_0= ruleHeight ) )
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:220:1: (lv_height_6_0= ruleHeight )
            	    {
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:220:1: (lv_height_6_0= ruleHeight )
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:221:3: lv_height_6_0= ruleHeight
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFrameAccess().getHeightHeightParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleHeight_in_ruleFrame464);
            	    lv_height_6_0=ruleHeight();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFrameRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"height",
            	            		lv_height_6_0, 
            	            		"Height");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFrameAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:244:4: ({...}? => ( ({...}? => ( ( (lv_content_7_0= ruleContent ) ) otherlv_8= '}' ) ) ) )
            	    {
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:244:4: ({...}? => ( ({...}? => ( ( (lv_content_7_0= ruleContent ) ) otherlv_8= '}' ) ) ) )
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:245:5: {...}? => ( ({...}? => ( ( (lv_content_7_0= ruleContent ) ) otherlv_8= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup(), 3)");
            	    }
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:245:100: ( ({...}? => ( ( (lv_content_7_0= ruleContent ) ) otherlv_8= '}' ) ) )
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:246:6: ({...}? => ( ( (lv_content_7_0= ruleContent ) ) otherlv_8= '}' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getFrameAccess().getUnorderedGroup(), 3);
            	    	 				
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:249:6: ({...}? => ( ( (lv_content_7_0= ruleContent ) ) otherlv_8= '}' ) )
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:249:7: {...}? => ( ( (lv_content_7_0= ruleContent ) ) otherlv_8= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleFrame", "true");
            	    }
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:249:16: ( ( (lv_content_7_0= ruleContent ) ) otherlv_8= '}' )
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:249:17: ( (lv_content_7_0= ruleContent ) ) otherlv_8= '}'
            	    {
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:249:17: ( (lv_content_7_0= ruleContent ) )
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:250:1: (lv_content_7_0= ruleContent )
            	    {
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:250:1: (lv_content_7_0= ruleContent )
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:251:3: lv_content_7_0= ruleContent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFrameAccess().getContentContentParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContent_in_ruleFrame540);
            	    lv_content_7_0=ruleContent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFrameRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"content",
            	            		lv_content_7_0, 
            	            		"Content");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleFrame552); 

            	        	newLeafNode(otherlv_8, grammarAccess.getFrameAccess().getRightCurlyBracketKeyword_3_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getFrameAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getFrameAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleFrame", "getUnorderedGroupHelper().canLeave(grammarAccess.getFrameAccess().getUnorderedGroup())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getFrameAccess().getUnorderedGroup());
            	

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFrame"


    // $ANTLR start "entryRuleTitle"
    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:294:1: entryRuleTitle returns [EObject current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final EObject entryRuleTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitle = null;


        try {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:295:2: (iv_ruleTitle= ruleTitle EOF )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:296:2: iv_ruleTitle= ruleTitle EOF
            {
             newCompositeNode(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_ruleTitle_in_entryRuleTitle634);
            iv_ruleTitle=ruleTitle();

            state._fsp--;

             current =iv_ruleTitle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTitle644); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:303:1: ruleTitle returns [EObject current=null] : (otherlv_0= 'title:' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleTitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:306:28: ( (otherlv_0= 'title:' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:307:1: (otherlv_0= 'title:' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:307:1: (otherlv_0= 'title:' ( (lv_name_1_0= RULE_STRING ) ) )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:307:3: otherlv_0= 'title:' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleTitle681); 

                	newLeafNode(otherlv_0, grammarAccess.getTitleAccess().getTitleKeyword_0());
                
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:311:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:312:1: (lv_name_1_0= RULE_STRING )
            {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:312:1: (lv_name_1_0= RULE_STRING )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:313:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTitle698); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTitleAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTitleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleWidth"
    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:337:1: entryRuleWidth returns [EObject current=null] : iv_ruleWidth= ruleWidth EOF ;
    public final EObject entryRuleWidth() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWidth = null;


        try {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:338:2: (iv_ruleWidth= ruleWidth EOF )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:339:2: iv_ruleWidth= ruleWidth EOF
            {
             newCompositeNode(grammarAccess.getWidthRule()); 
            pushFollow(FOLLOW_ruleWidth_in_entryRuleWidth739);
            iv_ruleWidth=ruleWidth();

            state._fsp--;

             current =iv_ruleWidth; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWidth749); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWidth"


    // $ANTLR start "ruleWidth"
    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:346:1: ruleWidth returns [EObject current=null] : (otherlv_0= 'width:' ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleWidth() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:349:28: ( (otherlv_0= 'width:' ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:350:1: (otherlv_0= 'width:' ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:350:1: (otherlv_0= 'width:' ( (lv_value_1_0= RULE_INT ) ) )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:350:3: otherlv_0= 'width:' ( (lv_value_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleWidth786); 

                	newLeafNode(otherlv_0, grammarAccess.getWidthAccess().getWidthKeyword_0());
                
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:354:1: ( (lv_value_1_0= RULE_INT ) )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:355:1: (lv_value_1_0= RULE_INT )
            {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:355:1: (lv_value_1_0= RULE_INT )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:356:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWidth803); 

            			newLeafNode(lv_value_1_0, grammarAccess.getWidthAccess().getValueINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWidthRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWidth"


    // $ANTLR start "entryRuleHeight"
    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:380:1: entryRuleHeight returns [EObject current=null] : iv_ruleHeight= ruleHeight EOF ;
    public final EObject entryRuleHeight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeight = null;


        try {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:381:2: (iv_ruleHeight= ruleHeight EOF )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:382:2: iv_ruleHeight= ruleHeight EOF
            {
             newCompositeNode(grammarAccess.getHeightRule()); 
            pushFollow(FOLLOW_ruleHeight_in_entryRuleHeight844);
            iv_ruleHeight=ruleHeight();

            state._fsp--;

             current =iv_ruleHeight; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHeight854); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeight"


    // $ANTLR start "ruleHeight"
    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:389:1: ruleHeight returns [EObject current=null] : (otherlv_0= 'height:' ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleHeight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:392:28: ( (otherlv_0= 'height:' ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:393:1: (otherlv_0= 'height:' ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:393:1: (otherlv_0= 'height:' ( (lv_value_1_0= RULE_INT ) ) )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:393:3: otherlv_0= 'height:' ( (lv_value_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleHeight891); 

                	newLeafNode(otherlv_0, grammarAccess.getHeightAccess().getHeightKeyword_0());
                
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:397:1: ( (lv_value_1_0= RULE_INT ) )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:398:1: (lv_value_1_0= RULE_INT )
            {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:398:1: (lv_value_1_0= RULE_INT )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:399:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHeight908); 

            			newLeafNode(lv_value_1_0, grammarAccess.getHeightAccess().getValueINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHeightRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeight"


    // $ANTLR start "entryRuleContent"
    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:423:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:424:2: (iv_ruleContent= ruleContent EOF )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:425:2: iv_ruleContent= ruleContent EOF
            {
             newCompositeNode(grammarAccess.getContentRule()); 
            pushFollow(FOLLOW_ruleContent_in_entryRuleContent949);
            iv_ruleContent=ruleContent();

            state._fsp--;

             current =iv_ruleContent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContent959); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:432:1: ruleContent returns [EObject current=null] : (otherlv_0= 'content' otherlv_1= '{' ( (lv_components_2_0= ruleComponent ) )+ otherlv_3= '}' ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_components_2_0 = null;


         enterRule(); 
            
        try {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:435:28: ( (otherlv_0= 'content' otherlv_1= '{' ( (lv_components_2_0= ruleComponent ) )+ otherlv_3= '}' ) )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:436:1: (otherlv_0= 'content' otherlv_1= '{' ( (lv_components_2_0= ruleComponent ) )+ otherlv_3= '}' )
            {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:436:1: (otherlv_0= 'content' otherlv_1= '{' ( (lv_components_2_0= ruleComponent ) )+ otherlv_3= '}' )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:436:3: otherlv_0= 'content' otherlv_1= '{' ( (lv_components_2_0= ruleComponent ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleContent996); 

                	newLeafNode(otherlv_0, grammarAccess.getContentAccess().getContentKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleContent1008); 

                	newLeafNode(otherlv_1, grammarAccess.getContentAccess().getLeftCurlyBracketKeyword_1());
                
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:444:1: ( (lv_components_2_0= ruleComponent ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=18 && LA3_0<=19)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:445:1: (lv_components_2_0= ruleComponent )
            	    {
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:445:1: (lv_components_2_0= ruleComponent )
            	    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:446:3: lv_components_2_0= ruleComponent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContentAccess().getComponentsComponentParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleComponent_in_ruleContent1029);
            	    lv_components_2_0=ruleComponent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"components",
            	            		lv_components_2_0, 
            	            		"Component");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleContent1042); 

                	newLeafNode(otherlv_3, grammarAccess.getContentAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleComponent"
    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:474:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:475:2: (iv_ruleComponent= ruleComponent EOF )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:476:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_ruleComponent_in_entryRuleComponent1078);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComponent1088); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:483:1: ruleComponent returns [EObject current=null] : (this_Label_0= ruleLabel | this_Button_1= ruleButton ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Label_0 = null;

        EObject this_Button_1 = null;


         enterRule(); 
            
        try {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:486:28: ( (this_Label_0= ruleLabel | this_Button_1= ruleButton ) )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:487:1: (this_Label_0= ruleLabel | this_Button_1= ruleButton )
            {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:487:1: (this_Label_0= ruleLabel | this_Button_1= ruleButton )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:488:5: this_Label_0= ruleLabel
                    {
                     
                            newCompositeNode(grammarAccess.getComponentAccess().getLabelParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLabel_in_ruleComponent1135);
                    this_Label_0=ruleLabel();

                    state._fsp--;

                     
                            current = this_Label_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:498:5: this_Button_1= ruleButton
                    {
                     
                            newCompositeNode(grammarAccess.getComponentAccess().getButtonParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleButton_in_ruleComponent1162);
                    this_Button_1=ruleButton();

                    state._fsp--;

                     
                            current = this_Button_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleLabel"
    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:514:1: entryRuleLabel returns [EObject current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final EObject entryRuleLabel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabel = null;


        try {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:515:2: (iv_ruleLabel= ruleLabel EOF )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:516:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel1197);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel1207); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:523:1: ruleLabel returns [EObject current=null] : (otherlv_0= 'label:' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleLabel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:526:28: ( (otherlv_0= 'label:' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:527:1: (otherlv_0= 'label:' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:527:1: (otherlv_0= 'label:' ( (lv_value_1_0= RULE_STRING ) ) )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:527:3: otherlv_0= 'label:' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleLabel1244); 

                	newLeafNode(otherlv_0, grammarAccess.getLabelAccess().getLabelKeyword_0());
                
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:531:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:532:1: (lv_value_1_0= RULE_STRING )
            {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:532:1: (lv_value_1_0= RULE_STRING )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:533:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabel1261); 

            			newLeafNode(lv_value_1_0, grammarAccess.getLabelAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleButton"
    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:557:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:558:2: (iv_ruleButton= ruleButton EOF )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:559:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_ruleButton_in_entryRuleButton1302);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButton1312); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:566:1: ruleButton returns [EObject current=null] : (otherlv_0= 'button:' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:569:28: ( (otherlv_0= 'button:' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) ) )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:570:1: (otherlv_0= 'button:' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) )
            {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:570:1: (otherlv_0= 'button:' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) ) )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:570:3: otherlv_0= 'button:' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= '->' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleButton1349); 

                	newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
                
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:574:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:575:1: (lv_value_1_0= RULE_STRING )
            {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:575:1: (lv_value_1_0= RULE_STRING )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:576:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleButton1366); 

            			newLeafNode(lv_value_1_0, grammarAccess.getButtonAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleButton1383); 

                	newLeafNode(otherlv_2, grammarAccess.getButtonAccess().getHyphenMinusGreaterThanSignKeyword_2());
                
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:596:1: ( (otherlv_3= RULE_ID ) )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:597:1: (otherlv_3= RULE_ID )
            {
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:597:1: (otherlv_3= RULE_ID )
            // ../fr.imta.dsl.evaluation.exe4/src-gen/fr/imta/dsl/evaluation/exe4/parser/antlr/internal/InternalExe4.g:598:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getButtonRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleButton1403); 

            		newLeafNode(otherlv_3, grammarAccess.getButtonAccess().getDestFrameCrossReference_3_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleButton"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\12\uffff";
    static final String DFA2_eofS =
        "\1\1\11\uffff";
    static final String DFA2_minS =
        "\1\13\1\uffff\4\0\4\uffff";
    static final String DFA2_maxS =
        "\1\21\1\uffff\4\0\4\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\5\4\uffff\1\1\1\2\1\3\1\4";
    static final String DFA2_specialS =
        "\2\uffff\1\0\1\1\1\2\1\3\4\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\3\uffff\1\3\1\4\1\5",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()+ loopback of 126:3: ( ({...}? => ( ({...}? => (otherlv_1= 'frame' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_title_4_0= ruleTitle ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_width_5_0= ruleWidth ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_height_6_0= ruleHeight ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_content_7_0= ruleContent ) ) otherlv_8= '}' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_2 = input.LA(1);

                         
                        int index2_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup(), 0) ) {s = 6;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getFrameAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index2_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA2_3 = input.LA(1);

                         
                        int index2_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup(), 1) ) {s = 7;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getFrameAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index2_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA2_4 = input.LA(1);

                         
                        int index2_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup(), 2) ) {s = 8;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getFrameAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index2_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA2_5 = input.LA(1);

                         
                        int index2_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getFrameAccess().getUnorderedGroup(), 3) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getFrameAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index2_5);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFrame_in_ruleModel130 = new BitSet(new long[]{0x0000000000038802L});
    public static final BitSet FOLLOW_ruleFrame_in_entryRuleFrame166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFrame176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleFrame258 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFrame275 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleFrame292 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleTitle_in_ruleFrame313 = new BitSet(new long[]{0x000000000003A802L});
    public static final BitSet FOLLOW_ruleWidth_in_ruleFrame389 = new BitSet(new long[]{0x000000000003A802L});
    public static final BitSet FOLLOW_ruleHeight_in_ruleFrame464 = new BitSet(new long[]{0x000000000003A802L});
    public static final BitSet FOLLOW_ruleContent_in_ruleFrame540 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleFrame552 = new BitSet(new long[]{0x000000000003A802L});
    public static final BitSet FOLLOW_ruleTitle_in_entryRuleTitle634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTitle644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleTitle681 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTitle698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWidth_in_entryRuleWidth739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWidth749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleWidth786 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWidth803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHeight_in_entryRuleHeight844 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHeight854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleHeight891 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHeight908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContent_in_entryRuleContent949 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContent959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleContent996 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleContent1008 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleComponent_in_ruleContent1029 = new BitSet(new long[]{0x00000000000C2000L});
    public static final BitSet FOLLOW_13_in_ruleContent1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComponent_in_entryRuleComponent1078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComponent1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleComponent1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_ruleComponent1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel1197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleLabel1244 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabel1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_entryRuleButton1302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButton1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleButton1349 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleButton1366 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleButton1383 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleButton1403 = new BitSet(new long[]{0x0000000000000002L});

}
