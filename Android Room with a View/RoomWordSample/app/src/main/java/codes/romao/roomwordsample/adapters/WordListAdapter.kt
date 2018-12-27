package codes.romao.roomwordsample.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import codes.romao.roomwordsample.R
import codes.romao.roomwordsample.data.Word
import kotlinx.android.synthetic.main.item_words.view.*

class WordListAdapter internal constructor() : RecyclerView.Adapter<WordListAdapter.WordViewHolder>() {

    private var words = emptyList<Word>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        return WordViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_words, parent, false))
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        val current = words[position]
        holder.itemView.wordTitleTXT.text = current.word
    }

    override fun getItemCount() = words.count()

    internal fun setWords(words: List<Word>) {
        this.words = words.map { it }
        notifyDataSetChanged()
    }

    class WordViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}