package Package_1_6;

import java.util.Scanner;

public class Hometask_1_6 {

    public static class Notebook {

        String[] note_entries = new String[0];

        public void show_note_entries() {
            int n = note_entries.length;
            System.out.println(n);
            if (n > 0) {
                for (int i = 0; i < note_entries.length; i++) {
                    System.out.println("(" + (i + 1) + ") " + note_entries[i]);
                }

            } else {
                System.out.println("Записи отсутствуют");
            }
        }
    }

    public static class Editnotebook {

        /**
         * @param new_entry
         * @param note_entries
         * @return
         */
        public String[] add_entries(String new_entry, String[] note_entries) {

            int n = note_entries.length + 1;
            String[] copy_notes = new String[n];


            if (n - 1 > 0) {
                for (int i = 0; i < n - 1; i++) {
                    copy_notes[i] = note_entries[i];
                }
                copy_notes[n - 1] = new_entry;
            } else {
                copy_notes[0] = new_entry;
            }

            return copy_notes;
        }

        /**
         * @param num_del_line
         * @param note_entries
         * @return copy_del_note
         */
        public String[] delete_entries(Integer num_del_line, String[] note_entries) {
            int m = note_entries.length - 1;
            m = m > 0 ? m : 0;
            String[] copy_del_note = new String[m];
            num_del_line = num_del_line - 1;
            if (m > 0) {
                for (int i = 0; i < num_del_line; i++) {
                    copy_del_note[i] = note_entries[i];
                    System.out.println("signal 1");
                }
                for (int i = num_del_line; i < m; i++) {
                    copy_del_note[i] = note_entries[i + 1];
                    System.out.println("signal 2");
                }
            }

            return copy_del_note;
        }

        /**
         * @param new_entry
         * @param num_re_line
         * @param note_entries
         * @return
         */
        public String[] edit_entries(String new_entry, Integer num_re_line, String[] note_entries) {
            int j = note_entries.length;
            String[] copy_re_entries = new String[j];
            if (j > 0) {

                for (int i = 0; i < num_re_line; i++) {
                    copy_re_entries[i] = note_entries[i];
                }
                copy_re_entries[num_re_line] = new_entry;
                for (int i = num_re_line + 1; i < j; i++) {
                    copy_re_entries[i] = note_entries[i];
                }

            }
            return copy_re_entries;
        }

    }

    public static void main(String[] args) {

        Notebook data = new Notebook();
        Editnotebook edit = new Editnotebook();

        Scanner input = new Scanner(System.in);
        edit.add_entries("123", data.note_entries);


        while (true) {
            System.out.println("Команды: Показать, Добавить, Удалить, Редактировать");
            String input_data = input.nextLine();


            if (input_data.equals("Exit")) {
                break;
            }

            switch (input_data) {


                case ("Показать"):
                    data.show_note_entries();
                    break;
                case ("Добавить"):
                    System.out.println("Введите запись или Отмена для отмены операции");
                    String note = input.nextLine();
                    data.note_entries = edit.add_entries(note, data.note_entries);

                    break;
                case ("Удалить"):
                    System.out.println("Введите номер строки, которую хотите удалить");
                    String delete_num = input.nextLine();
                    if (delete_num.equals("Отмена")) {
                        int n = Integer.parseInt(delete_num);
                        data.note_entries = edit.delete_entries(n, data.note_entries);
                    }
                    break;
                case ("Редактировать"):
                    System.out.println("Введите номер строки, которую хотите редактировать");
                    String renote_num = input.nextLine();
                    int m = Integer.parseInt(renote_num);
                    System.out.println("Введите новую запись в строку " + m + "\n");
                    m -= 1;
                    System.out.println("Старая запись:\n\n" + data.note_entries[m]);
                    String renote = input.nextLine();
                    if (renote.equals("Отмена")) {
                        break;
                    }
                    else {
                        data.note_entries = edit.edit_entries(renote, m, data.note_entries);
                    }
                    break;
                default:
                    break;

            }
        }
    }
}