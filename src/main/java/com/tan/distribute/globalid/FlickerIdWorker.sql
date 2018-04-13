CREATE TABLE Tickets64 (
id bigint(20) unsigned NOT NULL auto_increment,
stub char(1) NOT NULL default '',
PRIMARY KEY (id),
UNIQUE KEY stub (stub)
) ENGINE=MyISAM

REPLACE INTO Tickets64 (stub) VALUES ('a');
SELECT LAST_INSERT_ID();

TicketServer1:
auto-increment-increment = 2
auto-increment-offset = 1
 
TicketServer2:
auto-increment-increment = 2
auto-increment-offset = 2