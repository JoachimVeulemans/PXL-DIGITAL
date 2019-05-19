begin
	for i in (select * from tabs) loop
		execute immediate ('drop table ' || i.table_name || ' cascade constraints');
	end loop;
	for i in (select * from user_objects where object_type = 'SEQUENCE') loop
		execute immediate ('drop sequence ' || i.object_name);
	end loop;
end;
/