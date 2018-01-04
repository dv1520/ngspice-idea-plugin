// Generated from /home/src/jetbrains-plugin-sample/src/grammars/org/ngs/parser/NgsParser.g4 by ANTLR 4.7
package org.ngs.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NgsParser}.
 */
public interface NgsParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NgsParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(NgsParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(NgsParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#circuit}.
	 * @param ctx the parse tree
	 */
	void enterCircuit(NgsParser.CircuitContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#circuit}.
	 * @param ctx the parse tree
	 */
	void exitCircuit(NgsParser.CircuitContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(NgsParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(NgsParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#tran_entry}.
	 * @param ctx the parse tree
	 */
	void enterTran_entry(NgsParser.Tran_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#tran_entry}.
	 * @param ctx the parse tree
	 */
	void exitTran_entry(NgsParser.Tran_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#print_entry}.
	 * @param ctx the parse tree
	 */
	void enterPrint_entry(NgsParser.Print_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#print_entry}.
	 * @param ctx the parse tree
	 */
	void exitPrint_entry(NgsParser.Print_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#include_entry}.
	 * @param ctx the parse tree
	 */
	void enterInclude_entry(NgsParser.Include_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#include_entry}.
	 * @param ctx the parse tree
	 */
	void exitInclude_entry(NgsParser.Include_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#option_entry}.
	 * @param ctx the parse tree
	 */
	void enterOption_entry(NgsParser.Option_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#option_entry}.
	 * @param ctx the parse tree
	 */
	void exitOption_entry(NgsParser.Option_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#print_node}.
	 * @param ctx the parse tree
	 */
	void enterPrint_node(NgsParser.Print_nodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#print_node}.
	 * @param ctx the parse tree
	 */
	void exitPrint_node(NgsParser.Print_nodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#print_node_v}.
	 * @param ctx the parse tree
	 */
	void enterPrint_node_v(NgsParser.Print_node_vContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#print_node_v}.
	 * @param ctx the parse tree
	 */
	void exitPrint_node_v(NgsParser.Print_node_vContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#print_node_i}.
	 * @param ctx the parse tree
	 */
	void enterPrint_node_i(NgsParser.Print_node_iContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#print_node_i}.
	 * @param ctx the parse tree
	 */
	void exitPrint_node_i(NgsParser.Print_node_iContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#d_entry}.
	 * @param ctx the parse tree
	 */
	void enterD_entry(NgsParser.D_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#d_entry}.
	 * @param ctx the parse tree
	 */
	void exitD_entry(NgsParser.D_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#q_entry}.
	 * @param ctx the parse tree
	 */
	void enterQ_entry(NgsParser.Q_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#q_entry}.
	 * @param ctx the parse tree
	 */
	void exitQ_entry(NgsParser.Q_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#j_entry}.
	 * @param ctx the parse tree
	 */
	void enterJ_entry(NgsParser.J_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#j_entry}.
	 * @param ctx the parse tree
	 */
	void exitJ_entry(NgsParser.J_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#z_entry}.
	 * @param ctx the parse tree
	 */
	void enterZ_entry(NgsParser.Z_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#z_entry}.
	 * @param ctx the parse tree
	 */
	void exitZ_entry(NgsParser.Z_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#m_entry}.
	 * @param ctx the parse tree
	 */
	void enterM_entry(NgsParser.M_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#m_entry}.
	 * @param ctx the parse tree
	 */
	void exitM_entry(NgsParser.M_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#t_entry}.
	 * @param ctx the parse tree
	 */
	void enterT_entry(NgsParser.T_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#t_entry}.
	 * @param ctx the parse tree
	 */
	void exitT_entry(NgsParser.T_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#o_entry}.
	 * @param ctx the parse tree
	 */
	void enterO_entry(NgsParser.O_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#o_entry}.
	 * @param ctx the parse tree
	 */
	void exitO_entry(NgsParser.O_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#u_entry}.
	 * @param ctx the parse tree
	 */
	void enterU_entry(NgsParser.U_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#u_entry}.
	 * @param ctx the parse tree
	 */
	void exitU_entry(NgsParser.U_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#y_entry}.
	 * @param ctx the parse tree
	 */
	void enterY_entry(NgsParser.Y_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#y_entry}.
	 * @param ctx the parse tree
	 */
	void exitY_entry(NgsParser.Y_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#s_entry}.
	 * @param ctx the parse tree
	 */
	void enterS_entry(NgsParser.S_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#s_entry}.
	 * @param ctx the parse tree
	 */
	void exitS_entry(NgsParser.S_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#w_entry}.
	 * @param ctx the parse tree
	 */
	void enterW_entry(NgsParser.W_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#w_entry}.
	 * @param ctx the parse tree
	 */
	void exitW_entry(NgsParser.W_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#r_entry}.
	 * @param ctx the parse tree
	 */
	void enterR_entry(NgsParser.R_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#r_entry}.
	 * @param ctx the parse tree
	 */
	void exitR_entry(NgsParser.R_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#c_entry}.
	 * @param ctx the parse tree
	 */
	void enterC_entry(NgsParser.C_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#c_entry}.
	 * @param ctx the parse tree
	 */
	void exitC_entry(NgsParser.C_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#k_entry}.
	 * @param ctx the parse tree
	 */
	void enterK_entry(NgsParser.K_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#k_entry}.
	 * @param ctx the parse tree
	 */
	void exitK_entry(NgsParser.K_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#l_entry}.
	 * @param ctx the parse tree
	 */
	void enterL_entry(NgsParser.L_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#l_entry}.
	 * @param ctx the parse tree
	 */
	void exitL_entry(NgsParser.L_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#i_entry}.
	 * @param ctx the parse tree
	 */
	void enterI_entry(NgsParser.I_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#i_entry}.
	 * @param ctx the parse tree
	 */
	void exitI_entry(NgsParser.I_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#v_entry}.
	 * @param ctx the parse tree
	 */
	void enterV_entry(NgsParser.V_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#v_entry}.
	 * @param ctx the parse tree
	 */
	void exitV_entry(NgsParser.V_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#v_val}.
	 * @param ctx the parse tree
	 */
	void enterV_val(NgsParser.V_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#v_val}.
	 * @param ctx the parse tree
	 */
	void exitV_val(NgsParser.V_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#v_tran}.
	 * @param ctx the parse tree
	 */
	void enterV_tran(NgsParser.V_tranContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#v_tran}.
	 * @param ctx the parse tree
	 */
	void exitV_tran(NgsParser.V_tranContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#e_entry}.
	 * @param ctx the parse tree
	 */
	void enterE_entry(NgsParser.E_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#e_entry}.
	 * @param ctx the parse tree
	 */
	void exitE_entry(NgsParser.E_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#e_poly}.
	 * @param ctx the parse tree
	 */
	void enterE_poly(NgsParser.E_polyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#e_poly}.
	 * @param ctx the parse tree
	 */
	void exitE_poly(NgsParser.E_polyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#e_simple}.
	 * @param ctx the parse tree
	 */
	void enterE_simple(NgsParser.E_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#e_simple}.
	 * @param ctx the parse tree
	 */
	void exitE_simple(NgsParser.E_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#g_entry}.
	 * @param ctx the parse tree
	 */
	void enterG_entry(NgsParser.G_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#g_entry}.
	 * @param ctx the parse tree
	 */
	void exitG_entry(NgsParser.G_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#f_entry}.
	 * @param ctx the parse tree
	 */
	void enterF_entry(NgsParser.F_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#f_entry}.
	 * @param ctx the parse tree
	 */
	void exitF_entry(NgsParser.F_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#h_entry}.
	 * @param ctx the parse tree
	 */
	void enterH_entry(NgsParser.H_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#h_entry}.
	 * @param ctx the parse tree
	 */
	void exitH_entry(NgsParser.H_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#f_poly}.
	 * @param ctx the parse tree
	 */
	void enterF_poly(NgsParser.F_polyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#f_poly}.
	 * @param ctx the parse tree
	 */
	void exitF_poly(NgsParser.F_polyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#f_simple}.
	 * @param ctx the parse tree
	 */
	void enterF_simple(NgsParser.F_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#f_simple}.
	 * @param ctx the parse tree
	 */
	void exitF_simple(NgsParser.F_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#x_entry}.
	 * @param ctx the parse tree
	 */
	void enterX_entry(NgsParser.X_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#x_entry}.
	 * @param ctx the parse tree
	 */
	void exitX_entry(NgsParser.X_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#kv_entry}.
	 * @param ctx the parse tree
	 */
	void enterKv_entry(NgsParser.Kv_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#kv_entry}.
	 * @param ctx the parse tree
	 */
	void exitKv_entry(NgsParser.Kv_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#kvpair}.
	 * @param ctx the parse tree
	 */
	void enterKvpair(NgsParser.KvpairContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#kvpair}.
	 * @param ctx the parse tree
	 */
	void exitKvpair(NgsParser.KvpairContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#subckt}.
	 * @param ctx the parse tree
	 */
	void enterSubckt(NgsParser.SubcktContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#subckt}.
	 * @param ctx the parse tree
	 */
	void exitSubckt(NgsParser.SubcktContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#subckt_head_entry}.
	 * @param ctx the parse tree
	 */
	void enterSubckt_head_entry(NgsParser.Subckt_head_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#subckt_head_entry}.
	 * @param ctx the parse tree
	 */
	void exitSubckt_head_entry(NgsParser.Subckt_head_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#subckt_tail_entry}.
	 * @param ctx the parse tree
	 */
	void enterSubckt_tail_entry(NgsParser.Subckt_tail_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#subckt_tail_entry}.
	 * @param ctx the parse tree
	 */
	void exitSubckt_tail_entry(NgsParser.Subckt_tail_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#a_entry}.
	 * @param ctx the parse tree
	 */
	void enterA_entry(NgsParser.A_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#a_entry}.
	 * @param ctx the parse tree
	 */
	void exitA_entry(NgsParser.A_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#a_node}.
	 * @param ctx the parse tree
	 */
	void enterA_node(NgsParser.A_nodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#a_node}.
	 * @param ctx the parse tree
	 */
	void exitA_node(NgsParser.A_nodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#a_arr}.
	 * @param ctx the parse tree
	 */
	void enterA_arr(NgsParser.A_arrContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#a_arr}.
	 * @param ctx the parse tree
	 */
	void exitA_arr(NgsParser.A_arrContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#a_val}.
	 * @param ctx the parse tree
	 */
	void enterA_val(NgsParser.A_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#a_val}.
	 * @param ctx the parse tree
	 */
	void exitA_val(NgsParser.A_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#a_val_typed_node}.
	 * @param ctx the parse tree
	 */
	void enterA_val_typed_node(NgsParser.A_val_typed_nodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#a_val_typed_node}.
	 * @param ctx the parse tree
	 */
	void exitA_val_typed_node(NgsParser.A_val_typed_nodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#a_val_typed_v}.
	 * @param ctx the parse tree
	 */
	void enterA_val_typed_v(NgsParser.A_val_typed_vContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#a_val_typed_v}.
	 * @param ctx the parse tree
	 */
	void exitA_val_typed_v(NgsParser.A_val_typed_vContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#model_entry}.
	 * @param ctx the parse tree
	 */
	void enterModel_entry(NgsParser.Model_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#model_entry}.
	 * @param ctx the parse tree
	 */
	void exitModel_entry(NgsParser.Model_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#eol}.
	 * @param ctx the parse tree
	 */
	void enterEol(NgsParser.EolContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#eol}.
	 * @param ctx the parse tree
	 */
	void exitEol(NgsParser.EolContext ctx);
	/**
	 * Enter a parse tree produced by {@link NgsParser#ffff}.
	 * @param ctx the parse tree
	 */
	void enterFfff(NgsParser.FfffContext ctx);
	/**
	 * Exit a parse tree produced by {@link NgsParser#ffff}.
	 * @param ctx the parse tree
	 */
	void exitFfff(NgsParser.FfffContext ctx);
}