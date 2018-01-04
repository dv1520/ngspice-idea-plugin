parser grammar NgsParser;
options {   tokenVocab = NgsLexer;

}
//import NgsLexer;
root: circuit EOF;
circuit: (((subckt | line) eol )| NEWLINE)+;

line: r_entry | c_entry | l_entry
| v_entry | i_entry

| e_entry | g_entry | f_entry | h_entry


| x_entry
| a_entry
| model_entry

| k_entry

| s_entry | w_entry
| t_entry | o_entry | u_entry | y_entry



| d_entry
| q_entry | j_entry | z_entry | m_entry

| tran_entry | print_entry
| include_entry | option_entry
;


tran_entry: TRAN VAL VAL (VAL VAL?)? VAL?;
print_entry: PRINT PLOT_TYPE print_node+;
include_entry: INCLUDE FILENAME;
option_entry: OPTION (KV_KEY EQ VAL)+;
//           V    (      1 , 2)
print_node: print_node_i | print_node_v;
print_node_v: PLOT_POINT_TYPE? PAR_L NODE (COMMA NODE)? PAR_R;
print_node_i: PLOT_POINT_TYPE PAR_L H_V PAR_R;

d_entry: H_D NODE NODE MODEL_NAME kv_entry*;

q_entry: H_Q NODE NODE NODE NODE? MODEL_NAME kv_entry*;
j_entry: H_J NODE NODE NODE MODEL_NAME kv_entry*;
z_entry: H_Z NODE NODE NODE MODEL_NAME kv_entry*;

m_entry: H_M NODE NODE NODE NODE MODEL_NAME kv_entry*;

t_entry: H_T NODE NODE NODE NODE kvpair kv_entry*;
o_entry: H_O NODE NODE NODE NODE MODEL_NAME;
u_entry: H_U NODE NODE NODE MODEL_NAME kvpair kv_entry*;
y_entry: H_Y NODE NODE NODE NODE MODEL_NAME kv_entry*;

s_entry: H_S NODE NODE NODE NODE MODEL_NAME VAL?;
w_entry: H_W NODE NODE H_V MODEL_NAME VAL?;

r_entry: H_R NODE NODE (MODEL_NAME)? kv_entry*;
c_entry: H_C NODE NODE (MODEL_NAME)? kv_entry*;
k_entry: H_K H_L H_L kv_entry*;
l_entry: H_L NODE NODE (MODEL_NAME)? kv_entry*;


i_entry: H_I NODE NODE v_val*;
v_entry: H_V NODE NODE v_val*;
v_val: v_tran | VAL;
v_tran:
PULSE PAR_L VAL VAL VAL VAL VAL VAL VAL PAR_R
| SIN PAR_L VAL VAL VAL VAL VAL PAR_R
| EXP PAR_L VAL VAL VAL VAL VAL VAL PAR_R
| PWL PAR_L VAL VAL VAL* PAR_R
| SFFM PAR_L VAL VAL VAL VAL VAL PAR_R
| AM PAR_L VAL VAL VAL VAL VAL PAR_R
| TRNOISE PAR_L VAL VAL VAL VAL VAL VAL VAL PAR_R
| TRRANDOM PAR_L VAL VAL (VAL (VAL VAL?)?)? PAR_R
| EXTERNAL;

e_entry : (H_E NODE NODE ) (e_poly | e_simple);
e_poly: POLY VAL NODE+ VAL+;
e_simple: NODE NODE VAL;

g_entry: (H_G NODE NODE ) (e_poly | e_simple);

f_entry : (H_F NODE NODE ) (f_poly | f_simple);
h_entry : (H_H NODE NODE ) (f_poly | f_simple);

f_poly: POLY VAL H_V+ VAL+;
f_simple: H_V VAL;




x_entry: H_X NODE+ SUBCKT_NAME kvpair*;
kv_entry: VAL | kvpair;
kvpair: KV_KEY EQ VAL (COMMA VAL)*;

subckt: subckt_head_entry NEWLINE circuit subckt_tail_entry eol; // todo: why is eol required?
subckt_head_entry: H_SUBCKT SUBCKT_NAME NODE+ kv_entry*;
subckt_tail_entry: H_SUBCKT_TAIL SUBCKT_NAME;


a_entry: H_A a_node+ MODEL_NAME;
a_node: a_arr | a_val;
a_arr: XA_NODE_TYPE ? BR_L a_val BR_R;
a_val: NODE NODE? | H_V | a_val_typed_node | a_val_typed_v;
a_val_typed_node: XA_NODE_TYPE PAR_L NODE NODE? PAR_R; // two nodes - for diff types
a_val_typed_v: XA_NODE_TYPE PAR_L H_V PAR_R;



model_entry: H_MODEL MODEL_NAME VAL PAR_L? kvpair* PAR_R?;

eol: (NEWLINE | <eof>);
ffff: <eof>;